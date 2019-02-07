# Inolusion's Resource Therapy Center Project

Web app Prototype

Using Maven, Spring Boot, Thymeleaf, and Flyway Migration

With SQL server support

Explanation of the project directory tree.

Resources.static = non-dynamic web pages

Resources.templates = dynamic pages

Java.com.inolusion.rtc.patient_record_system.entities = possible templates for table entities, such as patient or insurance OR the finished form

PatientRecordSystemApplication.java = Launcher of the program

GreeterController = Specifies how and where the web page is stored and how it behaves

webapp folder may be unnecessary

IMPORTANT:
When first importing project from the Git Repo do the following:

Find the pom.xml file and right click it -> Maven -> Reimport

Go to File -> Project Structure -> Modules -> click the plus sign at the top-left and click import module -> select 'patient_record_system' and create using existing sources -> click through everything and hit finish -> Mark the java folder as Sources, the resources folder as Resources, and the test folder as Tests

If all else fails, use Google or ask me(Daniel the repo manager) for help.