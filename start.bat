start cmd /c "title eureka && java -jar .\eureka\target\eureka-0.0.1-SNAPSHOT.jar"

TIMEOUT /T 10

start cmd /c "title gateway && java -jar .\gateway\target\gateway-0.0.1-SNAPSHOT.jar"

start cmd /c "title service && java -jar .\service\target\service-0.0.1-SNAPSHOT.jar"