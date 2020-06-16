# ParallelTesting

This project was originally made by one of my students to show me his knowledge in SerenityBDD. I used it as a base for different experiments to understand how to execute Selenium Grid and parallel testing, so please don't judge it or even try to use it as a perfect referece for your tests.

## Parallel testing with JUnit

Basically, all we need to do is use a method with the following structure:

```java
    @Test
    public void runAllTests() {
        Class<?>[] classes = {IniciarSesionRunner1.class,IniciarSesionRunner2.class,AlertaRunner.class};
 
        // ParallelComputer(true,true) will run all classes and methods
        // in parallel.  (First arg for classes, second arg for methods)
        // I set true, true this means classes and methods runs in parallel.
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
```

That's the code you can see in [My Runner](../master/src/test/java/com/guru99/gurubank/pruebas/runners/ParalelosRunner.java).

Now, the description of how this works would be:

1. Create a runner and add all the code above. 
2. The method should be marked with the @Test annotation
3. Indicate the test cases (specific runners) you want to execute in parallel in front of the object `classes`. In this example, I used three classes which are SerenityWithCucumber runners.
4. Now, the line that executes the classes is already explained in the comment, so we just have to leave it untouched.

That's it. There's no additional configuration to execute tests in parallel with JUnit.

## Parallel testing with Gradle

Inside my [build.gradle](../master/build.gradle), please check the following code:

```groovy
test {
  //maxParallelForks = Runtime.runtime.availableProcessors().intdiv(2) ?: 1 
  maxParallelForks =3
  ignoreFailures = true
}
```

The logic is simple:
+ Use the line maxParallelForks = Runtime.runtime.availableProcessors().intdiv(2) ?: 1 if you want Gradle to check your available processors and use them for your tests
+ Use maxParallelForks = 3 if you want to specify how many exact processors Gradle can use (in this example, I use three processors). Obviously, the number should be less or equal to the total number of processors in the machine. This is not very recommenden because not all the processors are available for this, and this affect the performance of the execution.

## Parallel testing with Selenium Grid and Serenity

Well, we just need to configure one of the options mentioned so far (parallel testing with junit or gradle). Then, we just have to configure selenium grid inside the file [serenity.properties](../master/serenity.properties):

```
webdriver.driver=remote
webdriver.remote.url=http://192.168.1.5:5567/wd/hub
webdriver.remote.driver=chrome
webdriver.remote.os=WINDOWS
```

And that's it! That was the configuration I used to succesfully execute my tests with Selenium Grid, and with everything you have read in this readme, you may have a basic idea of how to execute tests in parallel. I did these experiments for one friend whose executions lasted for around 8 hours. Now they only take 2 hours.

## Selenium Grid References

1. [An example video](https://www.youtube.com/watch?v=gFCnX23li2g)
2. [The github of the project shown in reference 1](https://github.com/Specialize-Automation/Selenium_GRID_Configuration)

# Excel Report

So...I used this project again, it's like the perfect tool for parallel experiments with different things. This time, I was asked to develop a simple automation of a report in Excel. Just the logic and show how to use it. The code is probably not the best, but at least my client loved it and could use it as a base (or maybe did not even change it), and that's all that matters.

## ExcelUtilities

The class where all the magic happens is [here](../master/src/main/java/com/guru99/gurubank/pruebas/utilities/UtilidadesExcel.java). The code must be able to write in one Excel file, in different sheets and during parallel execution. With the following methods, all those conditions were achieved:

+ The method ```sobreescribirExcel``` initialize the workbook in the class. Of all the methods I have in UtilidadesExcel, this one is the first that must be executed. Also, this method writes the headers of the columns with the method ```createHeaderRow```.
+ The method ```agregarNuevaFilaDeDatos``` writes the data you want in the file and sheet you specify. This method is a little bit dirty (the file should be general...I think this could be a public static final in other class maybe, or an input from Cucumber).
+ "What if I told you I do not want to overwrite the data from previous executions?"...this is what justifies the existence of ```obtenerIndiceDeCeldaVacia```. Here we get the index where the method ```agregarNuevaFilaDeDatos``` should write the new data, without overwriting anything.

And that's it! I performed a Parallel execution with JUnit, writing in two different sheets and everything was succesful. I still need to read about BufferedReaders and BufferedWrites, also about Input and Output Steams to understand everything that happens behind the stage and maybe improve this. But at least, this was more than perfect for the need the client had.

## Excel References

1. [https://www.codejava.net/coding/how-to-read-excel-files-in-java-using-apache-poi](https://www.codejava.net/coding/how-to-read-excel-files-in-java-using-apache-poi)
2. [https://www.codejava.net/coding/how-to-write-excel-files-in-java-using-apache-poi](https://www.codejava.net/coding/how-to-write-excel-files-in-java-using-apache-poi)
