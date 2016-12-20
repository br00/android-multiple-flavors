# AndroidMultipleFlavors
Android sample app of implementation of multiple gradle flavors

When can be useful using multiple flavors? Well for me the following example is the best scenario. I mean after that you'll be soooo happy to know flavors. :D

Suppose you have to create different EditText giving different functionalities based on demo or full version of the app.
Let's say black background for demo and white background for full.
Off course don't think just to an edittext.. you can solve this stupid issue with themes so think bigger!

So you can create different EditText classes. Like MDemoEditText, MFullEditText. Excellent! 

Now when you try to put your own custom edittext into your layout you will have to do something like:
```java
<yourpackage.MDemoEditText .. />
```       
or 


```java
<yourpackage.MFullEditText .. />
```

Now how can you pick the right object based on the build type (Demo or Full)? You can't because to put your custom view in the xml layout android wants an absolute package. 
Yeah could be so cool have a dynamic namespace but then what's the purpose of the xml?

and.. we have the flavors!

So create different classes but with the same name MEditText. It is possible off course if we use "different" package like:

```java
|--- src
    |--- cinnamon
    |   |--- java  
    |   |   |--- custom
    |   |   |   |--- MEditText
    |--- vanilla
    |   |--- java 
    |   |   |--- custom
    |   |   |   |--- MEditText 
```
Now you can use your custom view without any complain from android.
```java
<yourpackage.custom.MEditText ... />
```
Put your classes outside of the main folder otherwise when you'll build a debug version you'll have a duplicated class exception.

And using finally the build flavors:

```java
productFlavors {
    cinnamon {
        applicationIdSuffix ".cinnamon"
        versionNameSuffix "-cinnamon"
    }
    vanilla {
        applicationIdSuffix ".vanilla"
        versionNameSuffix "-vanilla"
    }
}
```
See here for more details:
https://developer.android.com/studio/build/build-variants.html
