FROM openjdk:11-jre-slim

RUN apt-get update && apt-get install -y --no-install-recommends xvfb openjfx && rm -rf /var/lib/apt/lists/*

WORKDIR /bodyband

VOLUME /libs

ADD ./lib/* /bodyband/libs/

ADD BodyBandAndroid-all.jar /bodyband/BodyBandAndroid-latest.jar

ADD bodyband.db /bodyband/bodyband.db

ENTRYPOINT ["java", "--module-path",  "/bodyband/libs/", "--add-modules", "javafx.controls,javafx.fxml,javafx.graphics", "-jar", "/bodyband/BodyBandAndroid-latest.jar"]