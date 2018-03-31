## Compilation & Execution Instructions
### Task1: MakeDirectory Example.
This application can implement to create directory.
##### To Compile :  
``` javac CommandsDemo.java ```
##### To Run :
``` java CommandsDemo mkdir E:\\Epam ```

##### output : 
```
Note: Directory has created with name of Epam.
success....
file has created.
```
### Task2: File List Implementation Example.
This application can implement The FileListImplement class can print list of current directory files on console.
##### To Compile :  
``` javac CommandsDemo.java ```
##### To Run :
``` java CommandsDemo ls E:\\ ```

##### output : 
```
Directoy of E:
File Creation Time		Last Modified Time		LastAccessTime			File Name
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	.classpath
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	.project
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	.settings
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	Data.txt
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	pom.xml
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	src
2018-01-29T14:08:35.421785Z	2018-01-29T14:08:59.433235Z	2018-01-29T14:08:59.433235Z	target

```
### Task3: Copy directory Implementation Example.
This application can copy source folder files to destionation folder.
##### To Compile :  
``` javac CommandsDemo.java ```
##### To Run :
``` java CommandsDemo cp E:\eclipse\kittu E:\eclipse\\kittucopy ```

##### output : 
```
Directory created :: E:\eclipse\kittucopy
File copied :: E:\eclipse\kittucopy\ki.txt
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache\artifacts.xml
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache\binary
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache\binary\epp.package.jee.executable.win32.win32.x86_64_4.7.1.20171009-0537
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache\binary\org.eclipse.platform.ide.executable.win32.win32.x86_64_4.7.1.M20171009-0410
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache\binary\org.eclipse.platform_root_4.7.1.v20171009-0410
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.core\cache\binary\org.eclipse.rcp_root_4.7.1.v20171009-0410
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\.settings
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\.settings\org.eclipse.equinox.p2.artifact.repository.prefs
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\.settings\org.eclipse.equinox.p2.metadata.repository.prefs
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\.settings
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\.settings\org.eclipse.equinox.p2.artifact.repository.prefs
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\.settings\org.eclipse.equinox.p2.metadata.repository.prefs
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\.settings\org.eclipse.equinox.p2.ui.sdk.prefs
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\.settings\org.eclipse.equinox.p2.ui.sdk.scheduler.prefs
Directory created :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\org.eclipse.equinox.internal.p2.touchpoint.eclipse.actions
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.data\org.eclipse.equinox.internal.p2.touchpoint.eclipse.actions\jvmargs
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\.lock
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1507596063800.profile.gz
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1507596063823.profile.gz
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1507596098218.profile.gz
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1507596100289.profile.gz
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1513242755243.profile.gz
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1513242761545.profile.gz
File copied :: E:\eclipse\kittucopy\org.eclipse.equinox.p2.engine\profileRegistry\epp.package.jee.profile\1516719269313.profile.gz

```