# **FORCE NUMBERS**

## INFORMATION

* **This program returns the product of exponential numbers.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **n**, **k**, **i** and **total** are defined with int.

* I assigned the value 1 to define the **total** variable in the for loop.

* Scanner class created for user to enter numbers.

* I continued the process by assigning the value 1 to the variable **i** in the for loop.

## CODES

```Java

        import java.util.Scanner;

        public class forcenumbers{

            public static void main(String[] args) {

                int n, k, i, total =1;

                Scanner input = new Scanner(System.in);


```

```Java

                System.out.print("Enter The Base Number : ");

                n = input.nextInt();

                System.out.print("Enter The Exponent Number : ");

                k = input.nextInt();


                for(i = 1; i <= k; i++){

                    total *= n;

                }
                System.out.println("Conclusion : " + total);
            }
        }

```

```bash

        Enter The Base Number : 5
        Enter The Exponent Number : 3
        Conclusion : 125

```

<br />

## LINK

* Click here https://github.com/Fogo9/ForceNumbers.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
