A demo android app using the Apache Cordova ( formerly PhoneGap ) framework.

This project has been forked from the original work by Raymond Camden, and started life here: https://github.com/cfjedimaster/PhoneGapMega 

PhoneGap has since been donated to the apache software foundation, and renamed Apache Cordova.

This project is a reorganisation of Raymonds work into a modern maven build, with updates to the code, configs as necessary to get it going again.

You can find a packaged version in the android/google play market here: https://play.google.com/store/apps/details?id=au.com.redata.android.demo

---------------


In order to run the maven build, you'll need to get the cordova download separately

(currently version 2.1.0, from here: http://phonegap.com/download )

unzip, and locate the android lib directory

$> cd /path/to/extracted-download/phonegap-phonegap-26d211b/lib/android

now install the jar that is in there as org.apache.cordova:cordova-android

$> mvn install:install-file -DgroupId=org.apache.cordova\
                            -DartifactId=cordova-android\
                            -Dversion=2.1.0\
                            -Dfile=./cordova-2.1.0.jar\
                            -Dpackaging=jar

presuming you have an android 2.2+ device attached, or an emulator either run or defined as the default target, run the build thusly:

$> mvn clean install

the android-maven-plugin can control a lot of operations on either a connected device or a running emulator, details on its operation can be found here: http://code.google.com/p/maven-android-plugin/


---------------------------

Using Eclipse

get a recent eclipse ( juno as of the time of writing )

get the android dev environment hooked up

get the m2e plugin

probably worth having the egit plugin sorted out too.

import maven project

hack!
