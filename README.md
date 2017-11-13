# IOT-static Testapp for Unikernel-tests

This is a dummy spring-boot application intended to test the performance of unikernels (osv, rumprun).
The application provides a REST interface at /average. The provided data represents collected temperature data (only statically).



## Compiling for Rumprun

The following steps are needed to compile the application into a running Rumprun Unikernel:



## Compiling for OSv

The following steps are needed to compile the application into a running OSv Unikernel:


```sh
cd iot-app-java-static
capstan build
capstan i
(master)⚡ % capstan build                                                                           /lnk/da/Praxis/iot-app-java-static
Building iot-app-java-static...
Uploading files...
1 / 1 [===========================================================================================================================] 100.00 % (master)⚡ % capstan i                                                                                     /lnk/da/Praxis/iot-app-java-static
Name                           Description                                        Version                   Created        
iot-app-java-static

capstan run iot-app-java-static
```

If you want to start the image yourself, the files you need can be found under ~/.capstan. The following are needed:

```
~/.capstan/repository/iot-app-java-static/iot-app-java-static.qemu
~/.capstan/instances/qemu/iot-app-java-static/disk.qcow2
```

