package at.ac.tuwien.dsg.iot.rest;


import at.ac.tuwien.dsg.iot.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * REST interface to query the database.
 *
 * Created by jan on 29.06.17.
 */
@RestController
public class GetDataRest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private List<MeasurementAvg> measurementAvgs = null;

    private List<MeasurementAvg> getData(){

        if (measurementAvgs == null) {
            measurementAvgs = new ArrayList<>();
            measurementAvgs.add(new MeasurementAvg(10, 43.69924051587827, MeasurePoint.MEASURE_POINT1));
            measurementAvgs.add(new MeasurementAvg(10, 32.55208562150415, MeasurePoint.MEASURE_POINT2));
            measurementAvgs.add(new MeasurementAvg(10, 21.154273903293145, MeasurePoint.MEASURE_POINT3));
            measurementAvgs.add(new MeasurementAvg(10, 21.154273903293145, MeasurePoint.MEASURE_POINT4));
        }
        return measurementAvgs;

    }

    /**
     * Get the average temperature and number of saved datapoints for all
     * measurepoints.
     *
     * @return
     */
    @RequestMapping("average")
    public List<MeasurementAvg> getAverageAll(){
        log.info("getAverageAll: ");
        return getData();
    }
}
