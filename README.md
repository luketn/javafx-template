# Sample Project Adapted from FireBurner

Generated using a maven archetype:

```
mvn archetype:generate -Dfilter=com.airhacks:igniter
```
See: [http://afterburner.adam-bien.com](http://afterburner.adam-bien.com)

Changes from the igniter archetype:
* Updated to Java 14. The Afterburner framework was built for Java 8.
  * Remove the PostConstruct annotation from the injected class. 
* Copied the 3 classes in from the AfterBurner library, and removed the Java 8 specific annotations.
* Added a module-info.java for the javafx modules.

### IntelliJ Config
Use JDK 15, with this vm option:
```
--add-exports javafx.base/com.sun.javafx.event=org.controlsfx.controls
```