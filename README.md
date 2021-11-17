# Smallest Minimum Multiple
## Description
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

## Task
✅ Task 1 → What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? 

## How did I get to this solution?

🇺🇸
1.- take into account 3 variables i, j and n where i is the range between 1..n, j are the numbers from 1 to the smallest number and n is the highest dividend

2.- A loop from 1 to n to go through all the dividends in case of going through all of them j will be the smallest number

3.- within the main loop another cycle where we will begin to divide the numbers.

🇪🇸
1.- tome en cuenta 3 variables i, j y  n donde i es el rango entre 1..n, j son los números de 1 hasta el smallest number y n es dividendo mayor

2.- Un bucle de 1 a n para recorrer todos los dividendos en caso de recorrerlos todos j será el smallest number

3.- dentro del bucle principal otro ciclo donde empezaremos a dividir los números.





## Sourse

`class number() {`

    `fun search(n:Int):Int{
        var i=1
        var j=1
        while(i<=n){
            while (j%i==0 ){
                i++
                if(i>n) break
            }
            if(i>n) break
            if(j%i!=0) {
                i = 1
                j++
            }
        }
        return j
    }
`}`

### Created by
- **Victor Escalante**
