# udp_printf
cordova debug ,print out information to a udp server ,broadcast

a very simple java package

I just want to debug cordova app in my old way : printf

But in the real phone, So I started a udp broadcast server in lisp 

the Ip is 192.168.31.255 ,port is 9999

change the host and port in DatagramClient.java to serve yours 

jar cvf udp_printf.jar udp_printf/*.class

then put this package (udp_printf.jar) into ## APP/platforms/android/libs ## ,(gradle build)

Then 

--------------------------------------------------------------------------
> import udp_printf.*;

> in Java code

> DatagramClient.uprintf(blah blah blah); it will print out on the udp broadcast server side

> Maybe overide it with System.out.println later :)

--------------------------------------------------------------------------




