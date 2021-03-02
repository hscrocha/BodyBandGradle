## Prerequisites ##

To get BodyBandAndroid-all.jar (the "JAR file") to run, first make sure that the latest version of JDK 11 is installed on your system. Verify installation and version by running "java -version" from the command line. You should get at least "java version "11.0.7" ....." as a response. In Windows, check that the PATH to the Java /bin folder has been set up.

## JavaFX 11 ##

Download and extract JavaFX11 (https://gluonhq.com/products/javafx/), making a note of the Linux path to /lib. The SQLite3 database file bodyband.db which accompanies the JAR file must be included in the same directory as the JAR file. (Windows users will be familiar with forward-slash as path tokens: C:/Program Files/someFolder/ and so on.) The SQLite3 library is already included in the JAR file.

Run the following command, changing your path (mine happened to be "/home/james/Dev/javafx-sdk-11.0.2/lib") to the /lib directory of JavaFX files. As already mentioned, the video URL shortcut does not work in Windows.

```
java --module-path /home/james/Dev/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml,javafx.graphics -jar BodyBandAndroid-all.jar
```