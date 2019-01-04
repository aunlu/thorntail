# thorntail
### Sample Thorntail Java Application

Using following frameworks/tools:

* Thorntail (https://thorntail.io) for runtime container
* Apache Camel (http://camel.apache.org) for integration
* fabric8  maven plugin (https://maven.fabric8.io/) for openshift/docker integration
* Hystrix (https://github.com/Netflix/Hystrix) for client side circuit-breaking

Run following command in order to startup sample server code:

    mvn thorntail:run
