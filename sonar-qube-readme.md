Code Quality Check
----------------------
SonarQube
Download From
----------------
Version compatible with JDK 11 :
-------------------------------
https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-8.9.10.61524.zip


Steps :
--------

1. Download SonarQube

1. Extract and Run StartSonar.bat

1. Visit localhost:9000 and change the security settings

1. Make the following changes

![image](https://i.ibb.co/mCy9stc/sonar-s1.png)

![image](https://i.ibb.co/nsjkffD/sonar-s2.png)

##### Maven Configuration
- Add the following dependencies and plugins to your maven project

###### pom.xml

```xml

	<properties>
		<maven.compiler.source>11</maven.compiler.source>
		<maven.compiler.target>11</maven.compiler.target>

		<!-- JaCoCo Properties -->
		<jacoco.version>0.8.6</jacoco.version>
		<sonar.java.coveragePlugin>jacoco</sonar.java.coveragePlugin>
		<sonar.dynamicAnalysis>reuseReports</sonar.dynamicAnalysis>
		<sonar.coverage.jacoco.xmlReportPaths>${project.basedir}/../target/jacoco.exec</sonar.coverage.jacoco.xmlReportPaths>
		<sonar.language>java</sonar.language>

	</properties>


	<dependencies>

		<dependency>
			<groupId>org.jacoco</groupId>
			<artifactId>jacoco-maven-plugin</artifactId>
			<version>0.8.6</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.sonarsource.scanner.maven/sonar-maven-plugin -->
		<dependency>
			<groupId>org.sonarsource.scanner.maven</groupId>
			<artifactId>sonar-maven-plugin</artifactId>
			<version>3.9.1.2184</version>
		</dependency>



		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.8.2</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.8.2</version>
			<scope>test</scope>
		</dependency>




	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>${jacoco.version}</version>
				<executions>
					<execution>
						<id>jacoco-initialize</id>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>jacoco-site</id>
						<phase>package</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<executions>
					<execution>
						<id>report</id>
						<goals>
							<goal>report-aggregate</goal>
						</goals>
						<phase>verify</phase>
					</execution>
				</executions>
			</plugin>

			<plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.19</version>
				<dependencies>
					<dependency>
						<groupId>org.junit.platform</groupId>
						<artifactId>junit-platform-surefire-provider</artifactId>
						<version>1.0.0</version>
					</dependency>
				</dependencies>
			</plugin>
		</plugins>
	</build>

```



Run your project as Maven Build with goal
---------------------------------------
clean verify sonar:sonar

Visit localhost:9000