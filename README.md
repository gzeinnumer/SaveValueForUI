# SaveValueForUI
 
```java
String str1 =  null;
logD("1. "+ s(str1)); //logD: 1. -

String str2 =  "data";
logD("2. "+ s(str2)); //logD: 2. data

String str3 = "10.0000";
logD("3. "+ di(str3)); //logD: 3. 10

String str4 = "10.0700";
logD("4. "+ d2(str4)); //logD: 4. 10.07

String str5 = "10.0600";
logD("5. "+ ru(str5)); //logD: 5. 11

String str6 = "10.0800";
logD("6. "+ ru(str6)); //logD: 6. 11
```

```java
public class GblFunction {

    private static final String TAG = "jkhmvfkjklhk";

    public static void logD(String msg){
        Log.d(TAG, "logD: "+msg);
    }

    public static String s(String value) {
        return value == null ? "-" : value;
    }

    //decimal int only/round down
    public static String di(String value) {
        Double d = Double.valueOf(value);

        double f = d - d.longValue();
        if (f == .0) {
            // format d.longValue() as int
            return String.valueOf(d.longValue());
        } else {
            // format d as double
            return String.valueOf(d);
        }
    }

    //decimal 2 comma
    public static String d2(String value) {
        return s(Double.parseDouble(value)+"");
    }

    //round UP
    public static String ru(String value) {
        return String.valueOf((int) Math.ceil(Double.parseDouble(value)));
    }
}
```

---

```
Copyright 2022 M. Fadli Zein
```
