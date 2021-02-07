class GroovyTut {

// main is where execution starts
static void main(String[] args){

  // Print to the screen
  println("Hello World");

  // ---------- MATH ----------
  // Everything in Groovy is an object
  // including numbers

  // def is used when you define a variable
  // Variables start with a letter and can
  // contain numbers and _
  // Variables are dynamically typed and can
  // hold any value
  def age = "Dog";
  age = 40;

  // The basic integer math operators
  println("5 + 4 = " + (5 + 4));
  println("5 - 4 = " + (5 - 4));
  println("5 * 4 = " + (5 * 4));
  println("5 / 4 = " + (5.intdiv(4)));
  println("5 % 4 = " + (5 % 4));

  // Floating point math operators
  println("5.2 + 4.4 = " + (5.2.plus(4.4)));
  println("5.2 - 4.4 = " + (5.2.minus(4.4)));
  println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
  println("5.2 / 4.4 = " + (5.2 / 4.4));

  // Order of operations
  println("3 + 2 * 5 = " + (3 + 2 * 5));
  println("(3 + 2) * 5 = " + ((3 + 2) * 5));

  // Increment and decrement
  println("age++ = " + (age++));
  println("++age = " + (++age));
  println("age-- = " + (age--));
  println("--age = " + (--age));

  // Largest values
  println("Biggest Int " + Integer.MAX_VALUE);
  println("Smallest Int " + Integer.MIN_VALUE);

  println("Biggest Float " + Float.MAX_VALUE);
  println("Smallest Float " + Float.MIN_VALUE);

  println("Biggest Double " + Double.MAX_VALUE);
  println("Smallest Double " + Double.MIN_VALUE);

  // Decimal Accuracy
  println("1.1000000000000001 + 1.1000000000000001 "
  + (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));

  // Math Functions
  def randNum = 2.0;
  println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
  println("Math.round(2.45) = " + (Math.round(2.45)));
  println("randNum.pow(3) = " + (randNum.pow(3)));
  println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
  println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
  println("Math.sqrt(9) = " + (Math.sqrt(9)));
  println("Math.cbrt(27) = " + (Math.cbrt(27)));
  println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
  println("Math.floor(2.45) = " + (Math.floor(2.45)));
  println("Math.min(2,3) = " + (Math.min(2,3)));
  println("Math.max(2,3) = " + (Math.max(2,3)));

  // Number to the power of e
  println("Math.log(2) = " + (Math.log(2)));

  // Base 10 logarithm
  println("Math.log10(2) = " + (Math.log10(2)));

  // Degrees and radians
  println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
  println("Math.toRadians(90) = " + (Math.toRadians(90)));

  // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
  println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));

  // Generate random value from 1 to 100
  println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));

  // ---------- STRINGS ----------

  def name = "Derek";

  // A string surrounded by single quotes is taken literally
  // but backslashed characters are recognized
  println('I am ${name}\n');
  println("I am $name\n");

  // Triple quoted strings continue over many lines
  def multString = '''I am
  a string
  that goes on
  for many lines''';

  println(multString);

  // You can access a string by index
  println("3rd Index of Name " + name[3]);
  println("Index of r " + name.indexOf('r'));

  // You can also get a slice
  println("1st 3 Characters " + name[0..2]);

  // Get specific Characters
  println("Every Other Character " + name[0,2,4]);

  // Get characters starting at index
  println("Substring at 1 " + name.substring(1));

  // Get characters at index up to another
  println("Substring at 1 to 4 " + name.substring(1,4));

  // Concatenate strings
  println("My Name " + name);
  println("My Name ".concat(name));

  // Repeat a string
  def repeatStr = "What I said is " * 2;
  println(repeatStr);

  // Check for equality
  println("Derek == Derek : " + ('Derek'.equals('Derek')));
  println("Derek == derek : " + ('Derek'.equalsIgnoreCase('derek')));

  // Get length of string
  println("Size " + repeatStr.length());

  // Remove first occurance
  println(repeatStr - "What");

  // Split the string
  println(repeatStr.split(' '));
  println(repeatStr.toList());

  // Replace all strings
  println(repeatStr.replaceAll('I', 'she'));

  // Uppercase and lowercase
  println("Uppercase " + name.toUpperCase());
  println("Lowercase " + name.toLowerCase());

  // <=> returns -1 if 1st string is before 2nd
  // 1 if the opposite and 0 if equal
  println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
  println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
  println("Ant <=> Ant " + ('Ant' <=> 'Ant'));

  // ---------- OUTPUT ----------
  // With double quotes we can insert variables
  def randString = "Random";
  println("A $randString string");

  // You can do the same thing with printf
  printf("A %s string \n", randString);

  // Use multiple values
  printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);

  /*

  // ---------- INPUT ----------
  print("Whats your name ");
  def fName = System.console().readLine();
  println("Hello " + fName);

  // You must cast to the right value
  // toInteger, toDouble
  print("Enter a number ");
  def num1 = System.console().readLine().toDouble();
  print("Enter another ");
  def num2 = System.console().readLine().toDouble();
  printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);

  */

  // ---------- LISTS ----------
  // Lists hold a list of objects with an index

  def primes = [2,3,5,7,11,13];

  // Get a value at an index
  println("2nd Prime " + primes[1]);
  println("3rd Prime " + primes.get(2));

  // They can hold anything
  def employee = ['Derek', 40, 6.25, [1,2,3]];

  println("2nd Number " + employee[3][1]);

  // Get the length
  println("Length " + primes.size());

  // Add an index
  primes.add(17);

  // Append to the right
  primes<<19;
  primes.add(23);

  // Concatenate 2 Lists
  primes + [29,31];

  // Remove the last item
  primes - [31];

  // Check if empty
  println("Is empty " + primes.isEmpty());

  // Get 1st 3
  println("1st 3 " + primes[0..2]);

  println(primes);

  // Get matches
  println("Matches " + primes.intersect([2,3,7]));

  // Reverse
  println("Reverse " + primes.reverse());

  // Sorted
  println("Sorted " + primes.sort());

  // Pop last item
  println("Last " + primes.pop());

  // ---------- MAPS ----------
  // List of objects with keys versus indexes

  def paulMap = [
    'name' : 'Paul',
    'age' : 35,
    'address' : '123 Main St',
    'list' : [1,2,3]
  ];

  // Access with key
  println("Name " + paulMap['name']);
  println("Age " + paulMap.get('age'));
  println("List Item " + paulMap['list'][1]);

  // Add key value
  paulMap.put('city', 'Pittsburgh');

  // Check for key
  println("Has City " + paulMap.containsKey('city'));

  // Size
  println("Size " + paulMap.size());

  // ---------- RANGE ----------
  // Ranges represent a range of values in shorthand notation

  def oneTo10 = 1..10;
  def aToZ = 'a'..'z';
  def zToA = 'z'..'a';

  println(oneTo10);
  println(aToZ);
  println(zToA);

  // Get size
  println("Size " + oneTo10.size());

  // get index
  println("2nd Item " + oneTo10.get(1));

  // Check if range contains
  println("Contains 11 " + oneTo10.contains(11));

  // Get last item
  println("Get Last " + oneTo10.getTo());

  println("Get First " + oneTo10.getFrom());

  // ---------- CONDITIONALS ----------
  // Conditonal Operators : ==, !=, >, <, >=, <=

  // Logical Operators : && || !

  def ageOld = 6;

  if(ageOld == 5){
    println("Go to Kindergarten");
  } else if((ageOld > 5) && (ageOld < 18)) {
    printf("Go to grade %d \n", (ageOld - 5));
  } else {
    println("Go to College");
  }

  def canVote = true;

  // Ternary operator
  println(canVote ? "Can Vote" : "Can't Vote");

  // Switch statement
  switch(ageOld) {
    case 16: println("You can drive");
    case 18:
      println("You can vote");

      // Stops checking the rest if true
      break;
    default: println("Have Fun");
  }

  // Switch with list options
  switch(ageOld){
    case 0..6 : println("Toddler"); break;
    case 7..12 : println("Child"); break;
    case 13..18 : println("Teenager"); break;
    default : println("Adult");
  }

  // ---------- LOOPING ----------
  // While loop

  def i = 0;

  while(i < 10){

    // If i is odd skip back to the beginning of the loop
    if(i % 2){
      i++;
      continue;
    }

    // If i equals 8 stop looping
    if(i == 8){
      break;
    }

    println(i);
    i++;
  }

  // Normal for loop
  for (i = 0; i < 5; i++) {
    println(i);
  }

  // for loop with a range
  for(j in 2..6){
    println(j);
  }

  // for loop with a list (Same with string)
  def randList = [10,12,13,14];

  for(j in randList){
    println(j);
  }

  // for loop with a map
  def custs = [
    100 : "Paul",
    101 : "Sally",
    102 : "Sue"
  ];

  for(cust in custs){
    println("$cust.value : $cust.key ");
  }

  // ---------- METHODS ----------
  // Methods allow us to break our code into parts and also
  // allow us to reuse code

  sayHello();

  // Pass parameters
  println("5 + 4 = " + getSum(5,4));

  // Demonstrate pass by value
  def myName = "Derek";
  passByValue(myName);
  println("In Main : " + myName);

  // Pass a list for doubling
  def listToDouble = [1,2,3,4];
  listToDouble = doubleList(listToDouble);
  println(listToDouble);

  // Pass unknown number of elements to a method
  def nums = sumAll(1,2,3,4);
  println("Sum : " + nums);

  // Calculate factorial (Recursion)
  def fact4 = factorial(4);
  println("Factorial 4 : " + fact4);

  // ---------- CLOSURES ----------
  // Closures represent blocks of code that can except parameters
  // and can be passed into methods.

  // Alternative factorial using a closure
  // num is the excepted parameter and call can call for
  // the code to be executed
  def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
  println("Factorial 4 : " + getFactorial(4));

  // A closure can access values outside of it
  def greeting = "Goodbye";
  def sayGoodbye = {theName -> println("$greeting $theName")}

  sayGoodbye("Derek");

  // each performs an operation on each item in list
  def numList = [1,2,3,4];
  numList.each { println(it); }

  // Do the same with a map
  def employees = [
    'Paul' : 34,
    'Sally' : 35,
    'Sam' : 36
  ];

  employees.each { println("${it.key} : ${it.value}"); }

  // Print only evens
  def randNums = [1,2,3,4,5,6];
  randNums.each {num -> if(num % 2 == 0) println(num);}

  // find returns a match
  def nameList = ['Doug', 'Sally', 'Sue'];
  def matchEle = nameList.find {item -> item == 'Sue'}
  println(matchEle);

  // findAll finds all matches
  def randNumList = [1,2,3,4,5,6];
  def numMatches = randNumList.findAll {item -> item > 4}
  println(numMatches);

  // any checks if any item matches
  println("> 5 : " + randNumList.any {item -> item > 5});

  // every checks that all items match
  println("> 1 : " + randNumList.every {item -> item > 1});

  // collect performs operations on every item
  println("Double : " + randNumList.collect { item -> item * 2});

  // pass closure to a method
  def getEven = {num -> return(num % 2 == 0)}
  def evenNums = listEdit(randNumList, getEven);
  println("Evens : " + evenNums);

  // ---------- FILE IO ----------

  // Open a file, read each line and output them
  new File("test.txt").eachLine {
    line -> println "$line";
  }

  // Overwrite the file
  new File("test.txt").withWriter('utf-8') {
    writer -> writer.writeLine("Line 4");
  }

  // Append the file
  File file = new File("test.txt");
  file.append('Line 5');

  // Get the file as a string
  println(file.text);

  // Get the file size
  println("File Size : ${file.length()} bytes");

  // Check if a file or directory
  println("File : ${file.isFile()}");
  println("Dir : ${file.isDirectory()}");

  // Copy file to another file
  def newFile = new File("test2.txt");
  newFile << file.text;

  // Delete a file
  newFile.delete();

  // Get directory files
  def dirFiles = new File("").listRoots();
  dirFiles.each {
    item -> println file.absolutePath;
  }

  // ---------- OOP ----------
  // Classes are blueprints that are used to define objects
  // Every object has attributes (fields) and capabilities
  // (methods)

  // Create an Animal object with named parameters
  // def king = new Animal(name : 'King', sound : 'Growl');
  // or with a Constructor
  def king = new Animal('King', 'Growl');

  println("${king.name} says ${king.sound}");

  // Change an object attribute with a setter
  king.setSound('Grrrr');
  println("${king.name} says ${king.sound}");

  king.run();

  println(king.toString());

  // With inheritance a class can inherit all fields
  // and methods of another class
  def grover = new Dog('Grover', 'Grrrrr', 'Derek');

  king.makeSound();
  grover.makeSound();

  // Mammal inherits from the abstract class Thing
  def hamster = new Mammal('Furry');
  hamster.getInfo();

  // ---------- EXCEPTION HANDLING ----------
  // Handles runtime errors

  try {
    File testFile;
    testFile.append('Line 5');
  }
  catch(NullPointerException ex){

    // Prints exception
    println(ex.toString());

    // Prints error message
    println(ex.getMessage());
  }
  catch(Exception ex){
    println("I Catch Everything");
  }
  finally {
    println("I perform clean up")
  }


}

// ---------- METHODS ----------

// Define them with def and static which means it is shared
// by all instances of the class
static def sayHello() {
  println("Hello");
}

// Methods can receive parameters that have default values
static def getSum(num1=0, num2=0){
  return num1 + num2;
}

// Any object passed to a method is pass by value
static def passByValue(name){

  // name here is local to the function and can't
  // be accessed outside of it
  name = "In Function";
  println("Name : " + name);
}

// Receive and return a list
static def doubleList(list){

  // Collect performs a calculation on every item in the list
  def newList = list.collect { it * 2};
  return newList;
}

// Pass unknown number of elements to a method
static def sumAll(int... num){
  def sum = 0;

  // Performs a calculation on every item with each
  num.each { sum += it; }
  return sum;
}

// Calculate factorial (Recursion)
static def factorial(num){
  if(num <= 1){
    return 1;
  } else {
    return (num * factorial(num - 1));
  }
}

// 1st: num = 4 * factorial(3) = 4 * 6 = 24
// 2nd: num = 3 * factorial(2) = 3 * 2 = 6
// 3rd: num = 2 * factorial(1) = 2 * 1 = 2

// ---------- CLOSURES ----------
// pass closure to a method

static def listEdit(list, clo){
  return list.findAll(clo);
}

}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210
211
212
213
214
215
216
217
218
219
220
221
222
223
224
225
226
227
228
229
230
231
232
233
234
235
236
237
238
239
240
241
242
243
244
245
246
247
248
249
250
251
252
253
254
255
256
257
258
259
260
261
262
263
264
265
266
267
268
269
270
271
272
273
274
275
276
277
278
279
280
281
282
283
284
285
286
287
288
289
290
291
292
293
294
295
296
297
298
299
300
301
302
303
304
305
306
307
308
309
310
311
312
313
314
315
316
317
318
319
320
321
322
323
324
325
326
327
328
329
330
331
332
333
334
335
336
337
338
339
340
341
342
343
344
345
346
347
348
349
350
351
352
353
354
355
356
357
358
359
360
361
362
363
364
365
366
367
368
369
370
371
372
373
374
375
376
377
378
379
380
381
382
383
384
385
386
387
388
389
390
391
392
393
394
395
396
397
398
399
400
401
402
403
404
405
406
407
408
409
410
411
412
413
414
415
416
417
418
419
420
421
422
423
424
425
426
427
428
429
430
431
432
433
434
435
436
437
438
439
440
441
442
443
444
445
446
447
448
449
450
451
452
453
454
455
456
457
458
459
460
461
462
463
464
465
466
467
468
469
470
471
472
473
474
475
476
477
478
479
480
481
482
483
484
485
486
487
488
489
490
491
492
493
494
495
496
497
498
499
500
501
502
503
504
505
506
507
508
509
510
511
512
513
514
515
516
517
518
519
520
521
522
523
524
525
526
527
528
529
530
531
532
533
534
535
536
537
538
539
540
541
542
543
544
545
546
547
548
549
550
551
552
553
554
555
556
557
558
559
560
561
562
563
564
565
566
567
568
569
570
571
572
573
574
575
576
577
578
579
580
581
582
583
584
585
586
587
588
589
590
591
592
593
594
595
596
597
598
599
600
601
602
603
604
605
606
607
608
609
610
611
612
613
614
615
616
617
618
619
620
621
622
623
624
625
626
627
628
629
630
631
632
633
634
635
/*
Install Groovy on Mac
1. Update Java to at least Java 7 in the System Preferences Java Control Panel
 
2. Type in Terminal /usr/libexec/java_home -V
to get something like
1.7.0_55, x86_64:    "Java SE 7"    /Library/Java/JavaVirtualMachines/jdk1.7.0_55.jdk/Contents/Home
 
3. Type in terminal export JAVA_HOME=`/usr/libexec/java_home -v 1.7.0_55, x86_64`
 
4. Type in terminal java -version and make sure you have at least Java 7
 
5. Install HomeBrew at http://brew.sh/
 
6. Type in terminal brew install groovy
 
7. In Atom Open Command Palette -> Install Packages Themes -> Type language-groovy and install
 
Install Groovy on Windows
 
1. Go here http://groovy-lang.org/download.html
 
2. Click Windows Installer and click next a bunch of times until it is installed.
*/
 
class GroovyTut {
 
// main is where execution starts
static void main(String[] args){
 
  // Print to the screen
  println("Hello World");
 
  // ---------- MATH ----------
  // Everything in Groovy is an object
  // including numbers
 
  // def is used when you define a variable
  // Variables start with a letter and can
  // contain numbers and _
  // Variables are cynamically typed and can
  // hold any value
  def age = "Dog";
  age = 40;
 
  // The basic integer math operators
  println("5 + 4 = " + (5 + 4));
  println("5 - 4 = " + (5 - 4));
  println("5 * 4 = " + (5 * 4));
  println("5 / 4 = " + (5.intdiv(4)));
  println("5 % 4 = " + (5 % 4));
 
  // Floating point math operators
  println("5.2 + 4.4 = " + (5.2.plus(4.4)));
  println("5.2 - 4.4 = " + (5.2.minus(4.4)));
  println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
  println("5.2 / 4.4 = " + (5.2 / 4.4));
 
  // Order of operations
  println("3 + 2 * 5 = " + (3 + 2 * 5));
  println("(3 + 2) * 5 = " + ((3 + 2) * 5));
 
  // Increment and decrement
  println("age++ = " + (age++));
  println("++age = " + (++age));
  println("age-- = " + (age--));
  println("--age = " + (--age));
 
  // Largest values
  println("Biggest Int " + Integer.MAX_VALUE);
  println("Smallest Int " + Integer.MIN_VALUE);
 
  println("Biggest Float " + Float.MAX_VALUE);
  println("Smallest Float " + Float.MIN_VALUE);
 
  println("Biggest Double " + Double.MAX_VALUE);
  println("Smallest Double " + Double.MIN_VALUE);
 
  // Decimal Accuracy
  println("1.1000000000000001 + 1.1000000000000001 "
  + (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));
 
  // Math Functions
  def randNum = 2.0;
  println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
  println("Math.round(2.45) = " + (Math.round(2.45)));
  println("randNum.pow(3) = " + (randNum.pow(3)));
  println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
  println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
  println("Math.sqrt(9) = " + (Math.sqrt(9)));
  println("Math.cbrt(27) = " + (Math.cbrt(27)));
  println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
  println("Math.floor(2.45) = " + (Math.floor(2.45)));
  println("Math.min(2,3) = " + (Math.min(2,3)));
  println("Math.max(2,3) = " + (Math.max(2,3)));
 
  // Number to the power of e
  println("Math.log(2) = " + (Math.log(2)));
 
  // Base 10 logarithm
  println("Math.log10(2) = " + (Math.log10(2)));
 
  // Degrees and radians
  println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
  println("Math.toRadians(90) = " + (Math.toRadians(90)));
 
  // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
  println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));
 
  // Generate random value from 1 to 100
  println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));
 
  // ---------- STRINGS ----------
 
  def name = "Derek";
 
  // A string surrounded by single quotes is taken literally
  // but backslashed characters are recognized
  println('I am ${name}\n');
  println("I am $name\n");
 
  // Triple quoted strings continue over many lines
  def multString = '''I am
  a string
  that goes on
  for many lines''';
 
  println(multString);
 
  // You can access a string by index
  println("3rd Index of Name " + name[3]);
  println("Index of r " + name.indexOf('r'));
 
  // You can also get a slice
  println("1st 3 Characters " + name[0..2]);
 
  // Get specific Characters
  println("Every Other Character " + name[0,2,4]);
 
  // Get characters starting at index
  println("Substring at 1 " + name.substring(1));
 
  // Get characters at index up to another
  println("Substring at 1 to 4 " + name.substring(1,4));
 
  // Concatenate strings
  println("My Name " + name);
  println("My Name ".concat(name));
 
  // Repeat a string
  def repeatStr = "What I said is " * 2;
  println(repeatStr);
 
  // Check for equality
  println("Derek == Derek : " + ('Derek'.equals('Derek')));
  println("Derek == derek : " + ('Derek'.equalsIgnoreCase('derek')));
 
  // Get length of string
  println("Size " + repeatStr.length());
 
  // Remove first occurance
  println(repeatStr - "What");
 
  // Split the string
  println(repeatStr.split(' '));
  println(repeatStr.toList());
 
  // Replace all strings
  println(repeatStr.replaceAll('I', 'she'));
 
  // Uppercase and lowercase
  println("Uppercase " + name.toUpperCase());
  println("Lowercase " + name.toLowerCase());
 
  // <=> returns -1 if 1st string is before 2nd
  // 1 if the opposite and 0 if equal
  println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
  println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
  println("Ant <=> Ant " + ('Ant' <=> 'Ant'));
 
  // ---------- OUTPUT ----------
  // With double quotes we can insert variables
  def randString = "Random";
  println("A $randString string");
 
  // You can do the same thing with printf
  printf("A %s string \n", randString);
 
  // Use multiple values
  printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);
 
  /*
 
  // ---------- INPUT ----------
  print("Whats your name ");
  def fName = System.console().readLine();
  println("Hello " + fName);
 
  // You must cast to the right value
  // toInteger, toDouble
  print("Enter a number ");
  def num1 = System.console().readLine().toDouble();
  print("Enter another ");
  def num2 = System.console().readLine().toDouble();
  printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
 
  */
 
  // ---------- LISTS ----------
  // Lists hold a list of objects with an index
 
  def primes = [2,3,5,7,11,13];
 
  // Get a value at an index
  println("2nd Prime " + primes[1]);
  println("3rd Prime " + primes.get(2));
 
  // They can hold anything
  def employee = ['Derek', 40, 6.25, [1,2,3]];
 
  println("2nd Number " + employee[3][1]);
 
  // Get the length
  println("Length " + primes.size());
 
  // Add an index
  primes.add(17);
 
  // Append to the right
  primes<<19;
  primes.add(23);
 
  // Concatenate 2 Lists
  primes + [29,31];
 
  // Remove the last item
  primes - [31];
 
  // Check if empty
  println("Is empty " + primes.isEmpty());
 
  // Get 1st 3
  println("1st 3 " + primes[0..2]);
 
  println(primes);
 
  // Get matches
  println("Matches " + primes.intersect([2,3,7]));
 
  // Reverse
  println("Reverse " + primes.reverse());
 
  // Sorted
  println("Sorted " + primes.sort());
 
  // Pop last item
  println("Last " + primes.pop());
 
  // ---------- MAPS ----------
  // List of objects with keys versus indexes
 
  def paulMap = [
    'name' : 'Paul',
    'age' : 35,
    'address' : '123 Main St',
    'list' : [1,2,3]
  ];
 
  // Access with key
  println("Name " + paulMap['name']);
  println("Age " + paulMap.get('age'));
  println("List Item " + paulMap['list'][1]);
 
  // Add key value
  paulMap.put('city', 'Pittsburgh');
 
  // Check for key
  println("Has City " + paulMap.containsKey('city'));
 
  // Size
  println("Size " + paulMap.size());
 
  // ---------- RANGE ----------
  // Ranges represent a range of values in shorthand notation
 
  def oneTo10 = 1..10;
  def aToZ = 'a'..'z';
  def zToA = 'z'..'a';
 
  println(oneTo10);
  println(aToZ);
  println(zToA);
 
  // Get size
  println("Size " + oneTo10.size());
 
  // get index
  println("2nd Item " + oneTo10.get(1));
 
  // Check if range contains
  println("Contains 11 " + oneTo10.contains(11));
 
  // Get last item
  println("Get Last " + oneTo10.getTo());
 
  println("Get First " + oneTo10.getFrom());
 
  // ---------- CONDITIONALS ----------
  // Conditonal Operators : ==, !=, >, <, >=, <=
 
  // Logical Operators : && || !
 
  def ageOld = 6;
 
  if(ageOld == 5){
    println("Go to Kindergarten");
  } else if((ageOld > 5) && (ageOld < 18)) {
    printf("Go to grade %d \n", (ageOld - 5));
  } else {
    println("Go to College");
  }
 
  def canVote = true;
 
  // Ternary operator
  println(canVote ? "Can Vote" : "Can't Vote");
 
  // Switch statement
  switch(ageOld) {
    case 16: println("You can drive");
    case 18:
      println("You can vote");
 
      // Stops checking the rest if true
      break;
    default: println("Have Fun");
  }
 
  // Switch with list options
  switch(ageOld){
    case 0..6 : println("Toddler"); break;
    case 7..12 : println("Child"); break;
    case 13..18 : println("Teenager"); break;
    default : println("Adult");
  }
 
  // ---------- LOOPING ----------
  // While loop
 
  def i = 0;
 
  while(i < 10){
 
    // If i is odd skip back to the beginning of the loop
    if(i % 2){
      i++;
      continue;
    }
 
    // If i equals 8 stop looping
    if(i == 8){
      break;
    }
 
    println(i);
    i++;
  }
 
  // Normal for loop
  for (i = 0; i < 5; i++) {
    println(i);
  }
 
  // for loop with a range
  for(j in 2..6){
    println(j);
  }
 
  // for loop with a list (Same with string)
  def randList = [10,12,13,14];
 
  for(j in randList){
    println(j);
  }
 
  // for loop with a map
  def custs = [
    100 : "Paul",
    101 : "Sally",
    102 : "Sue"
  ];
 
  for(cust in custs){
    println("$cust.value : $cust.key ");
  }
 
  // ---------- METHODS ----------
  // Methods allow us to break our code into parts and also
  // allow us to reuse code
 
  sayHello();
 
  // Pass parameters
  println("5 + 4 = " + getSum(5,4));
 
  // Demonstrate pass by value
  def myName = "Derek";
  passByValue(myName);
  println("In Main : " + myName);
 
  // Pass a list for doubling
  def listToDouble = [1,2,3,4];
  listToDouble = doubleList(listToDouble);
  println(listToDouble);
 
  // Pass unknown number of elements to a method
  def nums = sumAll(1,2,3,4);
  println("Sum : " + nums);
 
  // Calculate factorial (Recursion)
  def fact4 = factorial(4);
  println("Factorial 4 : " + fact4);
 
  // ---------- CLOSURES ----------
  // Closures represent blocks of code that can except parameters
  // and can be passed into methods.
 
  // Alternative factorial using a closure
  // num is the excepted parameter and call can call for
  // the code to be executed
  def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
  println("Factorial 4 : " + getFactorial(4));
 
  // A closure can access values outside of it
  def greeting = "Goodbye";
  def sayGoodbye = {theName -> println("$greeting $theName")}
 
  sayGoodbye("Derek");
 
  // each performs an operation on each item in list
  def numList = [1,2,3,4];
  numList.each { println(it); }
 
  // Do the same with a map
  def employees = [
    'Paul' : 34,
    'Sally' : 35,
    'Sam' : 36
  ];
 
  employees.each { println("${it.key} : ${it.value}"); }
 
  // Print only evens
  def randNums = [1,2,3,4,5,6];
  randNums.each {num -> if(num % 2 == 0) println(num);}
 
  // find returns a match
  def nameList = ['Doug', 'Sally', 'Sue'];
  def matchEle = nameList.find {item -> item == 'Sue'}
  println(matchEle);
 
  // findAll finds all matches
  def randNumList = [1,2,3,4,5,6];
  def numMatches = randNumList.findAll {item -> item > 4}
  println(numMatches);
 
  // any checks if any item matches
  println("> 5 : " + randNumList.any {item -> item > 5});
 
  // every checks that all items match
  println("> 1 : " + randNumList.every {item -> item > 1});
 
  // collect performs operations on every item
  println("Double : " + randNumList.collect { item -> item * 2});
 
  // pass closure to a method
  def getEven = {num -> return(num % 2 == 0)}
  def evenNums = listEdit(randNumList, getEven);
  println("Evens : " + evenNums);
 
  // ---------- FILE IO ----------
 
  // Open a file, read each line and output them
  new File("test.txt").eachLine {
    line -> println "$line";
  }
 
  // Overwrite the file
  new File("test.txt").withWriter('utf-8') {
    writer -> writer.writeLine("Line 4");
  }
 
  // Append the file
  File file = new File("test.txt");
  file.append('Line 5');
 
  // Get the file as a string
  println(file.text);
 
  // Get the file size
  println("File Size : ${file.length()} bytes");
 
  // Check if a file or directory
  println("File : ${file.isFile()}");
  println("Dir : ${file.isDirectory()}");
 
  // Copy file to another file
  def newFile = new File("test2.txt");
  newFile << file.text;
 
  // Delete a file
  newFile.delete();
 
  // Get directory files
  def dirFiles = new File("").listRoots();
  dirFiles.each {
    item -> println file.absolutePath;
  }
 
  // ---------- OOP ----------
  // Classes are blueprints that are used to define objects
  // Every object has attributes (fields) and capabilities
  // (methods)
 
  // Create an Animal object with named parameters
  // def king = new Animal(name : 'King', sound : 'Growl');
  // or with a Constructor
  def king = new Animal('King', 'Growl');
 
  println("${king.name} says ${king.sound}");
 
  // Change an object attribute with a setter
  king.setSound('Grrrr');
  println("${king.name} says ${king.sound}");
 
  king.run();
 
  println(king.toString());
 
  // With inheritance a class can inherit all fields
  // and methods of another class
  def grover = new Dog('Grover', 'Grrrrr', 'Derek');
 
  king.makeSound();
  grover.makeSound();
 
  // Mammal inherits from the abstract class Thing
  def hamster = new Mammal('Furry');
  hamster.getInfo();
 
  // ---------- EXCEPTION HANDLING ----------
  // Handles runtime errors
 
  try {
    File testFile;
    testFile.append('Line 5');
  }
  catch(NullPointerException ex){
 
    // Prints exception
    println(ex.toString());
 
    // Prints error message
    println(ex.getMessage());
  }
  catch(Exception ex){
    println("I Catch Everything");
  }
  finally {
    println("I perform clean up")
  }
 
 
}
 
// ---------- METHODS ----------
 
// Define them with def and static which means it is shared
// by all instances of the class
static def sayHello() {
  println("Hello");
}
 
// Methods can receive parameters that have default values
static def getSum(num1=0, num2=0){
  return num1 + num2;
}
 
// Any object passed to a method is pass by value
static def passByValue(name){
 
  // name here is local to the function and can't
  // be accessed outside of it
  name = "In Function";
  println("Name : " + name);
}
 
// Receive and return a list
static def doubleList(list){
 
  // Collect performs a calculation on every item in the list
  def newList = list.collect { it * 2};
  return newList;
}
 
// Pass unknown number of elements to a method
static def sumAll(int... num){
  def sum = 0;
 
  // Performs a calculation on every item with each
  num.each { sum += it; }
  return sum;
}
 
// Calculate factorial (Recursion)
static def factorial(num){
  if(num <= 1){
    return 1;
  } else {
    return (num * factorial(num - 1));
  }
}
 
// 1st: num = 4 * factorial(3) = 4 * 6 = 24
// 2nd: num = 3 * factorial(2) = 3 * 2 = 6
// 3rd: num = 2 * factorial(1) = 2 * 1 = 2
 
// ---------- CLOSURES ----------
// pass closure to a method
 
static def listEdit(list, clo){
  return list.findAll(clo);
}
 
}
Animal.groovy

import groovy.transform.ToString;

// Creates the toString method
@ToString(includeNames=true, includeFields=true)
class Animal {
  // Fields (Attributes)
  def name;
  def sound;

  // Methods (Capabilites)

  def run(){
    println("${name} runs");
  }

  def makeSound(){
    println("${name} says ${sound}");
  }

  // Constructor Method
  def Animal(name, sound){
    this.name = name;
    this.sound = sound;
  }


}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
import groovy.transform.ToString;
 
// Creates the toString method
@ToString(includeNames=true, includeFields=true)
class Animal {
  // Fields (Attributes)
  def name;
  def sound;
 
  // Methods (Capabilites)
 
  def run(){
    println("${name} runs");
  }
 
  def makeSound(){
    println("${name} says ${sound}");
  }
 
  // Constructor Method
  def Animal(name, sound){
    this.name = name;
    this.sound = sound;
  }
 
 
}
Dog.groovy

class Dog extends Animal{
  def owner;

  // Constructor Method
  def Dog(name, sound, owner){

    // Call the Animal constructor
    super(name, sound);
    this.owner = owner;
  }

  // Overwrite the Animal makeSound()
  def makeSound(){
    println("${name} says bark and ${sound}");
  }
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
class Dog extends Animal{
  def owner;
 
  // Constructor Method
  def Dog(name, sound, owner){
 
    // Call the Animal constructor
    super(name, sound);
    this.owner = owner;
  }
 
  // Overwrite the Animal makeSound()
  def makeSound(){
    println("${name} says bark and ${sound}");
  }
}
Thing.groovy

// An Abstract class can't be instantiated, but it
// can contain fields, and abstract or concrete methods

abstract class Thing{
  public String name;
  public Thing() {}

  def getInfo(){
    println("The things name is ${name}");
  }
}
1
2
3
4
5
6
7
8
9
10
11
// An Abstract class can't be instantiated, but it
// can contain fields, and abstract or concrete methods
 
abstract class Thing{
  public String name;
  public Thing() {}
 
  def getInfo(){
    println("The things name is ${name}");
  }
}
Mammal.groovy

class Mammal extends Thing{
  def Mammal(name){
    this.name = name;
  }
}
1
2
3
4
5
class Mammal extends Thing{
  def Mammal(name){
    this.name = name;
  }
}
Widget.groovy

// An interface defines a contract that says any
// object that inherits from it will implement
// the methods defined by it
// All methods are abstract
class Widget {

  // Define abstract method that returns nothing
  void doSomething();
}
1
2
3
4
5
6
7
8
9
// An interface defines a contract that says any
// object that inherits from it will implement
// the methods defined by it
// All methods are abstract
class Widget {
 
  // Define abstract method that returns nothing
  void doSomething();
}
One Response to “Groovy Tutorial”
Gaby StewartJune 10, 2019 at 9:37 amI saw a few typos in the comments:math section “cynamically”-> “dynamically”
closures section “except” -> “accept”
reply
Leave a Reply
Your email address will not be published.

Comment 

Name

Email

Website

search
 
social networks
Facebook
YouTube
Twitter
LinkedIn

buy me a cup of coffee
"Donations help me to keep the site running. One dollar is greatly appreciated." - (Pay Pal Secured)

PayPal - The safer, easier way to pay online! 
my facebook page

archives
January 2021
December 2020
November 2020
October 2020
September 2020
August 2020
July 2020
June 2020
May 2020
April 2020
March 2020
February 2020
January 2020
December 2019
November 2019
October 2019
August 2019
July 2019
June 2019
May 2019
April 2019
March 2019
February 2019
January 2019
December 2018
October 2018
September 2018
August 2018
July 2018
June 2018
May 2018
April 2018
March 2018
February 2018
January 2018
December 2017
November 2017
October 2017
September 2017
August 2017
July 2017
June 2017
May 2017
April 2017
March 2017
February 2017
January 2017
December 2016
November 2016
October 2016
September 2016
August 2016
July 2016
June 2016
May 2016
April 2016
March 2016
February 2016
January 2016
December 2015
November 2015
October 2015
September 2015
August 2015
July 2015
June 2015
May 2015
April 2015
March 2015
February 2015
January 2015
December 2014
November 2014
October 2014
September 2014
August 2014
July 2014
June 2014
May 2014
April 2014
March 2014
February 2014
January 2014
December 2013
November 2013
October 2013
September 2013
August 2013
July 2013
June 2013
May 2013
April 2013
March 2013
February 2013
January 2013
December 2012
November 2012
October 2012
September 2012
August 2012
July 2012
June 2012
May 2012
April 2012
March 2012
February 2012
January 2012
December 2011
November 2011
October 2011
September 2011
August 2011
July 2011
June 2011
May 2011
April 2011
March 2011
February 2011
January 2011
December 2010
November 2010
October 2010
September 2010
August 2010
July 2010
June 2010
May 2010
April 2010
March 2010
February 2010
January 2010
December 2009
Powered by WordPress | Designed by Elegant Themes
About the Author Google+

New Think Tankhomeaboutbusiness plan »communication »dietingsalessitemapvideos »web design »Communication »Diet NutritionalFlash TutorialHow To »InvestingiPad »Marketing »Most PopularRoyalty Free PhotosSalesWeb Design »
delete
GROOVY TUTORIAL
Posted by Derek Banas on Apr 7, 2016 in Web Design | 1 comment
Groovy TutorialI have made learn in one videos for most every language and today based on your requests I will teach Groovy in One Video. We’ll learn how to install on Mac and Windows. Then I’ll cover the Basics, Math, Strings, Output, Input, Lists, Maps, Range, Conditonals, Looping, Methods, Closures, File IO, OOP and a ton of other topics in between. By the end you’ll learn as much as you’d learn in a standard 250 page book on Groovy.

All of the code and a transcript of the video follows the video below. I hope you enjoy it.



If you enjoy videos like this, consider throwing a dollar my way on Patreon.

[googleplusone]

Code & Transcript From the Video

groovytut.groovy

/*
Install Groovy on Mac
1. Update Java to at least Java 7 in the System Preferences Java Control Panel

2. Type in Terminal /usr/libexec/java_home -V
to get something like
1.7.0_55, x86_64:    "Java SE 7"    /Library/Java/JavaVirtualMachines/jdk1.7.0_55.jdk/Contents/Home

3. Type in terminal export JAVA_HOME=`/usr/libexec/java_home -v 1.7.0_55, x86_64`

4. Type in terminal java -version and make sure you have at least Java 7

5. Install HomeBrew at http://brew.sh/

6. Type in terminal brew install groovy

7. In Atom Open Command Palette -> Install Packages Themes -> Type language-groovy and install

Install Groovy on Windows

1. Go here http://groovy-lang.org/download.html

2. Click Windows Installer and click next a bunch of times until it is installed.
*/

class GroovyTut {

// main is where execution starts
static void main(String[] args){

  // Print to the screen
  println("Hello World");

  // ---------- MATH ----------
  // Everything in Groovy is an object
  // including numbers

  // def is used when you define a variable
  // Variables start with a letter and can
  // contain numbers and _
  // Variables are cynamically typed and can
  // hold any value
  def age = "Dog";
  age = 40;

  // The basic integer math operators
  println("5 + 4 = " + (5 + 4));
  println("5 - 4 = " + (5 - 4));
  println("5 * 4 = " + (5 * 4));
  println("5 / 4 = " + (5.intdiv(4)));
  println("5 % 4 = " + (5 % 4));

  // Floating point math operators
  println("5.2 + 4.4 = " + (5.2.plus(4.4)));
  println("5.2 - 4.4 = " + (5.2.minus(4.4)));
  println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
  println("5.2 / 4.4 = " + (5.2 / 4.4));

  // Order of operations
  println("3 + 2 * 5 = " + (3 + 2 * 5));
  println("(3 + 2) * 5 = " + ((3 + 2) * 5));

  // Increment and decrement
  println("age++ = " + (age++));
  println("++age = " + (++age));
  println("age-- = " + (age--));
  println("--age = " + (--age));

  // Largest values
  println("Biggest Int " + Integer.MAX_VALUE);
  println("Smallest Int " + Integer.MIN_VALUE);

  println("Biggest Float " + Float.MAX_VALUE);
  println("Smallest Float " + Float.MIN_VALUE);

  println("Biggest Double " + Double.MAX_VALUE);
  println("Smallest Double " + Double.MIN_VALUE);

  // Decimal Accuracy
  println("1.1000000000000001 + 1.1000000000000001 "
  + (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));

  // Math Functions
  def randNum = 2.0;
  println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
  println("Math.round(2.45) = " + (Math.round(2.45)));
  println("randNum.pow(3) = " + (randNum.pow(3)));
  println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
  println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
  println("Math.sqrt(9) = " + (Math.sqrt(9)));
  println("Math.cbrt(27) = " + (Math.cbrt(27)));
  println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
  println("Math.floor(2.45) = " + (Math.floor(2.45)));
  println("Math.min(2,3) = " + (Math.min(2,3)));
  println("Math.max(2,3) = " + (Math.max(2,3)));

  // Number to the power of e
  println("Math.log(2) = " + (Math.log(2)));

  // Base 10 logarithm
  println("Math.log10(2) = " + (Math.log10(2)));

  // Degrees and radians
  println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
  println("Math.toRadians(90) = " + (Math.toRadians(90)));

  // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
  println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));

  // Generate random value from 1 to 100
  println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));

  // ---------- STRINGS ----------

  def name = "Derek";

  // A string surrounded by single quotes is taken literally
  // but backslashed characters are recognized
  println('I am ${name}\n');
  println("I am $name\n");

  // Triple quoted strings continue over many lines
  def multString = '''I am
  a string
  that goes on
  for many lines''';

  println(multString);

  // You can access a string by index
  println("3rd Index of Name " + name[3]);
  println("Index of r " + name.indexOf('r'));

  // You can also get a slice
  println("1st 3 Characters " + name[0..2]);

  // Get specific Characters
  println("Every Other Character " + name[0,2,4]);

  // Get characters starting at index
  println("Substring at 1 " + name.substring(1));

  // Get characters at index up to another
  println("Substring at 1 to 4 " + name.substring(1,4));

  // Concatenate strings
  println("My Name " + name);
  println("My Name ".concat(name));

  // Repeat a string
  def repeatStr = "What I said is " * 2;
  println(repeatStr);

  // Check for equality
  println("Derek == Derek : " + ('Derek'.equals('Derek')));
  println("Derek == derek : " + ('Derek'.equalsIgnoreCase('derek')));

  // Get length of string
  println("Size " + repeatStr.length());

  // Remove first occurance
  println(repeatStr - "What");

  // Split the string
  println(repeatStr.split(' '));
  println(repeatStr.toList());

  // Replace all strings
  println(repeatStr.replaceAll('I', 'she'));

  // Uppercase and lowercase
  println("Uppercase " + name.toUpperCase());
  println("Lowercase " + name.toLowerCase());

  // <=> returns -1 if 1st string is before 2nd
  // 1 if the opposite and 0 if equal
  println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
  println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
  println("Ant <=> Ant " + ('Ant' <=> 'Ant'));

  // ---------- OUTPUT ----------
  // With double quotes we can insert variables
  def randString = "Random";
  println("A $randString string");

  // You can do the same thing with printf
  printf("A %s string \n", randString);

  // Use multiple values
  printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);

  /*

  // ---------- INPUT ----------
  print("Whats your name ");
  def fName = System.console().readLine();
  println("Hello " + fName);

  // You must cast to the right value
  // toInteger, toDouble
  print("Enter a number ");
  def num1 = System.console().readLine().toDouble();
  print("Enter another ");
  def num2 = System.console().readLine().toDouble();
  printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);

  */

  // ---------- LISTS ----------
  // Lists hold a list of objects with an index

  def primes = [2,3,5,7,11,13];

  // Get a value at an index
  println("2nd Prime " + primes[1]);
  println("3rd Prime " + primes.get(2));

  // They can hold anything
  def employee = ['Derek', 40, 6.25, [1,2,3]];

  println("2nd Number " + employee[3][1]);

  // Get the length
  println("Length " + primes.size());

  // Add an index
  primes.add(17);

  // Append to the right
  primes<<19;
  primes.add(23);

  // Concatenate 2 Lists
  primes + [29,31];

  // Remove the last item
  primes - [31];

  // Check if empty
  println("Is empty " + primes.isEmpty());

  // Get 1st 3
  println("1st 3 " + primes[0..2]);

  println(primes);

  // Get matches
  println("Matches " + primes.intersect([2,3,7]));

  // Reverse
  println("Reverse " + primes.reverse());

  // Sorted
  println("Sorted " + primes.sort());

  // Pop last item
  println("Last " + primes.pop());

  // ---------- MAPS ----------
  // List of objects with keys versus indexes

  def paulMap = [
    'name' : 'Paul',
    'age' : 35,
    'address' : '123 Main St',
    'list' : [1,2,3]
  ];

  // Access with key
  println("Name " + paulMap['name']);
  println("Age " + paulMap.get('age'));
  println("List Item " + paulMap['list'][1]);

  // Add key value
  paulMap.put('city', 'Pittsburgh');

  // Check for key
  println("Has City " + paulMap.containsKey('city'));

  // Size
  println("Size " + paulMap.size());

  // ---------- RANGE ----------
  // Ranges represent a range of values in shorthand notation

  def oneTo10 = 1..10;
  def aToZ = 'a'..'z';
  def zToA = 'z'..'a';

  println(oneTo10);
  println(aToZ);
  println(zToA);

  // Get size
  println("Size " + oneTo10.size());

  // get index
  println("2nd Item " + oneTo10.get(1));

  // Check if range contains
  println("Contains 11 " + oneTo10.contains(11));

  // Get last item
  println("Get Last " + oneTo10.getTo());

  println("Get First " + oneTo10.getFrom());

  // ---------- CONDITIONALS ----------
  // Conditonal Operators : ==, !=, >, <, >=, <=

  // Logical Operators : && || !

  def ageOld = 6;

  if(ageOld == 5){
    println("Go to Kindergarten");
  } else if((ageOld > 5) && (ageOld < 18)) {
    printf("Go to grade %d \n", (ageOld - 5));
  } else {
    println("Go to College");
  }

  def canVote = true;

  // Ternary operator
  println(canVote ? "Can Vote" : "Can't Vote");

  // Switch statement
  switch(ageOld) {
    case 16: println("You can drive");
    case 18:
      println("You can vote");

      // Stops checking the rest if true
      break;
    default: println("Have Fun");
  }

  // Switch with list options
  switch(ageOld){
    case 0..6 : println("Toddler"); break;
    case 7..12 : println("Child"); break;
    case 13..18 : println("Teenager"); break;
    default : println("Adult");
  }

  // ---------- LOOPING ----------
  // While loop

  def i = 0;

  while(i < 10){

    // If i is odd skip back to the beginning of the loop
    if(i % 2){
      i++;
      continue;
    }

    // If i equals 8 stop looping
    if(i == 8){
      break;
    }

    println(i);
    i++;
  }

  // Normal for loop
  for (i = 0; i < 5; i++) {
    println(i);
  }

  // for loop with a range
  for(j in 2..6){
    println(j);
  }

  // for loop with a list (Same with string)
  def randList = [10,12,13,14];

  for(j in randList){
    println(j);
  }

  // for loop with a map
  def custs = [
    100 : "Paul",
    101 : "Sally",
    102 : "Sue"
  ];

  for(cust in custs){
    println("$cust.value : $cust.key ");
  }

  // ---------- METHODS ----------
  // Methods allow us to break our code into parts and also
  // allow us to reuse code

  sayHello();

  // Pass parameters
  println("5 + 4 = " + getSum(5,4));

  // Demonstrate pass by value
  def myName = "Derek";
  passByValue(myName);
  println("In Main : " + myName);

  // Pass a list for doubling
  def listToDouble = [1,2,3,4];
  listToDouble = doubleList(listToDouble);
  println(listToDouble);

  // Pass unknown number of elements to a method
  def nums = sumAll(1,2,3,4);
  println("Sum : " + nums);

  // Calculate factorial (Recursion)
  def fact4 = factorial(4);
  println("Factorial 4 : " + fact4);

  // ---------- CLOSURES ----------
  // Closures represent blocks of code that can except parameters
  // and can be passed into methods.

  // Alternative factorial using a closure
  // num is the excepted parameter and call can call for
  // the code to be executed
  def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
  println("Factorial 4 : " + getFactorial(4));

  // A closure can access values outside of it
  def greeting = "Goodbye";
  def sayGoodbye = {theName -> println("$greeting $theName")}

  sayGoodbye("Derek");

  // each performs an operation on each item in list
  def numList = [1,2,3,4];
  numList.each { println(it); }

  // Do the same with a map
  def employees = [
    'Paul' : 34,
    'Sally' : 35,
    'Sam' : 36
  ];

  employees.each { println("${it.key} : ${it.value}"); }

  // Print only evens
  def randNums = [1,2,3,4,5,6];
  randNums.each {num -> if(num % 2 == 0) println(num);}

  // find returns a match
  def nameList = ['Doug', 'Sally', 'Sue'];
  def matchEle = nameList.find {item -> item == 'Sue'}
  println(matchEle);

  // findAll finds all matches
  def randNumList = [1,2,3,4,5,6];
  def numMatches = randNumList.findAll {item -> item > 4}
  println(numMatches);

  // any checks if any item matches
  println("> 5 : " + randNumList.any {item -> item > 5});

  // every checks that all items match
  println("> 1 : " + randNumList.every {item -> item > 1});

  // collect performs operations on every item
  println("Double : " + randNumList.collect { item -> item * 2});

  // pass closure to a method
  def getEven = {num -> return(num % 2 == 0)}
  def evenNums = listEdit(randNumList, getEven);
  println("Evens : " + evenNums);

  // ---------- FILE IO ----------

  // Open a file, read each line and output them
  new File("test.txt").eachLine {
    line -> println "$line";
  }

  // Overwrite the file
  new File("test.txt").withWriter('utf-8') {
    writer -> writer.writeLine("Line 4");
  }

  // Append the file
  File file = new File("test.txt");
  file.append('Line 5');

  // Get the file as a string
  println(file.text);

  // Get the file size
  println("File Size : ${file.length()} bytes");

  // Check if a file or directory
  println("File : ${file.isFile()}");
  println("Dir : ${file.isDirectory()}");

  // Copy file to another file
  def newFile = new File("test2.txt");
  newFile << file.text;

  // Delete a file
  newFile.delete();

  // Get directory files
  def dirFiles = new File("").listRoots();
  dirFiles.each {
    item -> println file.absolutePath;
  }

  // ---------- OOP ----------
  // Classes are blueprints that are used to define objects
  // Every object has attributes (fields) and capabilities
  // (methods)

  // Create an Animal object with named parameters
  // def king = new Animal(name : 'King', sound : 'Growl');
  // or with a Constructor
  def king = new Animal('King', 'Growl');

  println("${king.name} says ${king.sound}");

  // Change an object attribute with a setter
  king.setSound('Grrrr');
  println("${king.name} says ${king.sound}");

  king.run();

  println(king.toString());

  // With inheritance a class can inherit all fields
  // and methods of another class
  def grover = new Dog('Grover', 'Grrrrr', 'Derek');

  king.makeSound();
  grover.makeSound();

  // Mammal inherits from the abstract class Thing
  def hamster = new Mammal('Furry');
  hamster.getInfo();

  // ---------- EXCEPTION HANDLING ----------
  // Handles runtime errors

  try {
    File testFile;
    testFile.append('Line 5');
  }
  catch(NullPointerException ex){

    // Prints exception
    println(ex.toString());

    // Prints error message
    println(ex.getMessage());
  }
  catch(Exception ex){
    println("I Catch Everything");
  }
  finally {
    println("I perform clean up")
  }


}

// ---------- METHODS ----------

// Define them with def and static which means it is shared
// by all instances of the class
static def sayHello() {
  println("Hello");
}

// Methods can receive parameters that have default values
static def getSum(num1=0, num2=0){
  return num1 + num2;
}

// Any object passed to a method is pass by value
static def passByValue(name){

  // name here is local to the function and can't
  // be accessed outside of it
  name = "In Function";
  println("Name : " + name);
}

// Receive and return a list
static def doubleList(list){

  // Collect performs a calculation on every item in the list
  def newList = list.collect { it * 2};
  return newList;
}

// Pass unknown number of elements to a method
static def sumAll(int... num){
  def sum = 0;

  // Performs a calculation on every item with each
  num.each { sum += it; }
  return sum;
}

// Calculate factorial (Recursion)
static def factorial(num){
  if(num <= 1){
    return 1;
  } else {
    return (num * factorial(num - 1));
  }
}

// 1st: num = 4 * factorial(3) = 4 * 6 = 24
// 2nd: num = 3 * factorial(2) = 3 * 2 = 6
// 3rd: num = 2 * factorial(1) = 2 * 1 = 2

// ---------- CLOSURES ----------
// pass closure to a method

static def listEdit(list, clo){
  return list.findAll(clo);
}

}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210
211
212
213
214
215
216
217
218
219
220
221
222
223
224
225
226
227
228
229
230
231
232
233
234
235
236
237
238
239
240
241
242
243
244
245
246
247
248
249
250
251
252
253
254
255
256
257
258
259
260
261
262
263
264
265
266
267
268
269
270
271
272
273
274
275
276
277
278
279
280
281
282
283
284
285
286
287
288
289
290
291
292
293
294
295
296
297
298
299
300
301
302
303
304
305
306
307
308
309
310
311
312
313
314
315
316
317
318
319
320
321
322
323
324
325
326
327
328
329
330
331
332
333
334
335
336
337
338
339
340
341
342
343
344
345
346
347
348
349
350
351
352
353
354
355
356
357
358
359
360
361
362
363
364
365
366
367
368
369
370
371
372
373
374
375
376
377
378
379
380
381
382
383
384
385
386
387
388
389
390
391
392
393
394
395
396
397
398
399
400
401
402
403
404
405
406
407
408
409
410
411
412
413
414
415
416
417
418
419
420
421
422
423
424
425
426
427
428
429
430
431
432
433
434
435
436
437
438
439
440
441
442
443
444
445
446
447
448
449
450
451
452
453
454
455
456
457
458
459
460
461
462
463
464
465
466
467
468
469
470
471
472
473
474
475
476
477
478
479
480
481
482
483
484
485
486
487
488
489
490
491
492
493
494
495
496
497
498
499
500
501
502
503
504
505
506
507
508
509
510
511
512
513
514
515
516
517
518
519
520
521
522
523
524
525
526
527
528
529
530
531
532
533
534
535
536
537
538
539
540
541
542
543
544
545
546
547
548
549
550
551
552
553
554
555
556
557
558
559
560
561
562
563
564
565
566
567
568
569
570
571
572
573
574
575
576
577
578
579
580
581
582
583
584
585
586
587
588
589
590
591
592
593
594
595
596
597
598
599
600
601
602
603
604
605
606
607
608
609
610
611
612
613
614
615
616
617
618
619
620
621
622
623
624
625
626
627
628
629
630
631
632
633
634
635
/*
Install Groovy on Mac
1. Update Java to at least Java 7 in the System Preferences Java Control Panel
 
2. Type in Terminal /usr/libexec/java_home -V
to get something like
1.7.0_55, x86_64:    "Java SE 7"    /Library/Java/JavaVirtualMachines/jdk1.7.0_55.jdk/Contents/Home
 
3. Type in terminal export JAVA_HOME=`/usr/libexec/java_home -v 1.7.0_55, x86_64`
 
4. Type in terminal java -version and make sure you have at least Java 7
 
5. Install HomeBrew at http://brew.sh/
 
6. Type in terminal brew install groovy
 
7. In Atom Open Command Palette -> Install Packages Themes -> Type language-groovy and install
 
Install Groovy on Windows
 
1. Go here http://groovy-lang.org/download.html
 
2. Click Windows Installer and click next a bunch of times until it is installed.
*/
 
class GroovyTut {
 
// main is where execution starts
static void main(String[] args){
 
  // Print to the screen
  println("Hello World");
 
  // ---------- MATH ----------
  // Everything in Groovy is an object
  // including numbers
 
  // def is used when you define a variable
  // Variables start with a letter and can
  // contain numbers and _
  // Variables are cynamically typed and can
  // hold any value
  def age = "Dog";
  age = 40;
 
  // The basic integer math operators
  println("5 + 4 = " + (5 + 4));
  println("5 - 4 = " + (5 - 4));
  println("5 * 4 = " + (5 * 4));
  println("5 / 4 = " + (5.intdiv(4)));
  println("5 % 4 = " + (5 % 4));
 
  // Floating point math operators
  println("5.2 + 4.4 = " + (5.2.plus(4.4)));
  println("5.2 - 4.4 = " + (5.2.minus(4.4)));
  println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
  println("5.2 / 4.4 = " + (5.2 / 4.4));
 
  // Order of operations
  println("3 + 2 * 5 = " + (3 + 2 * 5));
  println("(3 + 2) * 5 = " + ((3 + 2) * 5));
 
  // Increment and decrement
  println("age++ = " + (age++));
  println("++age = " + (++age));
  println("age-- = " + (age--));
  println("--age = " + (--age));
 
  // Largest values
  println("Biggest Int " + Integer.MAX_VALUE);
  println("Smallest Int " + Integer.MIN_VALUE);
 
  println("Biggest Float " + Float.MAX_VALUE);
  println("Smallest Float " + Float.MIN_VALUE);
 
  println("Biggest Double " + Double.MAX_VALUE);
  println("Smallest Double " + Double.MIN_VALUE);
 
  // Decimal Accuracy
  println("1.1000000000000001 + 1.1000000000000001 "
  + (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111));
 
  // Math Functions
  def randNum = 2.0;
  println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
  println("Math.round(2.45) = " + (Math.round(2.45)));
  println("randNum.pow(3) = " + (randNum.pow(3)));
  println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
  println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
  println("Math.sqrt(9) = " + (Math.sqrt(9)));
  println("Math.cbrt(27) = " + (Math.cbrt(27)));
  println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
  println("Math.floor(2.45) = " + (Math.floor(2.45)));
  println("Math.min(2,3) = " + (Math.min(2,3)));
  println("Math.max(2,3) = " + (Math.max(2,3)));
 
  // Number to the power of e
  println("Math.log(2) = " + (Math.log(2)));
 
  // Base 10 logarithm
  println("Math.log10(2) = " + (Math.log10(2)));
 
  // Degrees and radians
  println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
  println("Math.toRadians(90) = " + (Math.toRadians(90)));
 
  // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
  println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));
 
  // Generate random value from 1 to 100
  println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));
 
  // ---------- STRINGS ----------
 
  def name = "Derek";
 
  // A string surrounded by single quotes is taken literally
  // but backslashed characters are recognized
  println('I am ${name}\n');
  println("I am $name\n");
 
  // Triple quoted strings continue over many lines
  def multString = '''I am
  a string
  that goes on
  for many lines''';
 
  println(multString);
 
  // You can access a string by index
  println("3rd Index of Name " + name[3]);
  println("Index of r " + name.indexOf('r'));
 
  // You can also get a slice
  println("1st 3 Characters " + name[0..2]);
 
  // Get specific Characters
  println("Every Other Character " + name[0,2,4]);
 
  // Get characters starting at index
  println("Substring at 1 " + name.substring(1));
 
  // Get characters at index up to another
  println("Substring at 1 to 4 " + name.substring(1,4));
 
  // Concatenate strings
  println("My Name " + name);
  println("My Name ".concat(name));
 
  // Repeat a string
  def repeatStr = "What I said is " * 2;
  println(repeatStr);
 
  // Check for equality
  println("Derek == Derek : " + ('Derek'.equals('Derek')));
  println("Derek == derek : " + ('Derek'.equalsIgnoreCase('derek')));
 
  // Get length of string
  println("Size " + repeatStr.length());
 
  // Remove first occurance
  println(repeatStr - "What");
 
  // Split the string
  println(repeatStr.split(' '));
  println(repeatStr.toList());
 
  // Replace all strings
  println(repeatStr.replaceAll('I', 'she'));
 
  // Uppercase and lowercase
  println("Uppercase " + name.toUpperCase());
  println("Lowercase " + name.toLowerCase());
 
  // <=> returns -1 if 1st string is before 2nd
  // 1 if the opposite and 0 if equal
  println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
  println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
  println("Ant <=> Ant " + ('Ant' <=> 'Ant'));
 
  // ---------- OUTPUT ----------
  // With double quotes we can insert variables
  def randString = "Random";
  println("A $randString string");
 
  // You can do the same thing with printf
  printf("A %s string \n", randString);
 
  // Use multiple values
  printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);
 
  /*
 
  // ---------- INPUT ----------
  print("Whats your name ");
  def fName = System.console().readLine();
  println("Hello " + fName);
 
  // You must cast to the right value
  // toInteger, toDouble
  print("Enter a number ");
  def num1 = System.console().readLine().toDouble();
  print("Enter another ");
  def num2 = System.console().readLine().toDouble();
  printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
 
  */
 
  // ---------- LISTS ----------
  // Lists hold a list of objects with an index
 
  def primes = [2,3,5,7,11,13];
 
  // Get a value at an index
  println("2nd Prime " + primes[1]);
  println("3rd Prime " + primes.get(2));
 
  // They can hold anything
  def employee = ['Derek', 40, 6.25, [1,2,3]];
 
  println("2nd Number " + employee[3][1]);
 
  // Get the length
  println("Length " + primes.size());
 
  // Add an index
  primes.add(17);
 
  // Append to the right
  primes<<19;
  primes.add(23);
 
  // Concatenate 2 Lists
  primes + [29,31];
 
  // Remove the last item
  primes - [31];
 
  // Check if empty
  println("Is empty " + primes.isEmpty());
 
  // Get 1st 3
  println("1st 3 " + primes[0..2]);
 
  println(primes);
 
  // Get matches
  println("Matches " + primes.intersect([2,3,7]));
 
  // Reverse
  println("Reverse " + primes.reverse());
 
  // Sorted
  println("Sorted " + primes.sort());
 
  // Pop last item
  println("Last " + primes.pop());
 
  // ---------- MAPS ----------
  // List of objects with keys versus indexes
 
  def paulMap = [
    'name' : 'Paul',
    'age' : 35,
    'address' : '123 Main St',
    'list' : [1,2,3]
  ];
 
  // Access with key
  println("Name " + paulMap['name']);
  println("Age " + paulMap.get('age'));
  println("List Item " + paulMap['list'][1]);
 
  // Add key value
  paulMap.put('city', 'Pittsburgh');
 
  // Check for key
  println("Has City " + paulMap.containsKey('city'));
 
  // Size
  println("Size " + paulMap.size());
 
  // ---------- RANGE ----------
  // Ranges represent a range of values in shorthand notation
 
  def oneTo10 = 1..10;
  def aToZ = 'a'..'z';
  def zToA = 'z'..'a';
 
  println(oneTo10);
  println(aToZ);
  println(zToA);
 
  // Get size
  println("Size " + oneTo10.size());
 
  // get index
  println("2nd Item " + oneTo10.get(1));
 
  // Check if range contains
  println("Contains 11 " + oneTo10.contains(11));
 
  // Get last item
  println("Get Last " + oneTo10.getTo());
 
  println("Get First " + oneTo10.getFrom());
 
  // ---------- CONDITIONALS ----------
  // Conditonal Operators : ==, !=, >, <, >=, <=
 
  // Logical Operators : && || !
 
  def ageOld = 6;
 
  if(ageOld == 5){
    println("Go to Kindergarten");
  } else if((ageOld > 5) && (ageOld < 18)) {
    printf("Go to grade %d \n", (ageOld - 5));
  } else {
    println("Go to College");
  }
 
  def canVote = true;
 
  // Ternary operator
  println(canVote ? "Can Vote" : "Can't Vote");
 
  // Switch statement
  switch(ageOld) {
    case 16: println("You can drive");
    case 18:
      println("You can vote");
 
      // Stops checking the rest if true
      break;
    default: println("Have Fun");
  }
 
  // Switch with list options
  switch(ageOld){
    case 0..6 : println("Toddler"); break;
    case 7..12 : println("Child"); break;
    case 13..18 : println("Teenager"); break;
    default : println("Adult");
  }
 
  // ---------- LOOPING ----------
  // While loop
 
  def i = 0;
 
  while(i < 10){
 
    // If i is odd skip back to the beginning of the loop
    if(i % 2){
      i++;
      continue;
    }
 
    // If i equals 8 stop looping
    if(i == 8){
      break;
    }
 
    println(i);
    i++;
  }
 
  // Normal for loop
  for (i = 0; i < 5; i++) {
    println(i);
  }
 
  // for loop with a range
  for(j in 2..6){
    println(j);
  }
 
  // for loop with a list (Same with string)
  def randList = [10,12,13,14];
 
  for(j in randList){
    println(j);
  }
 
  // for loop with a map
  def custs = [
    100 : "Paul",
    101 : "Sally",
    102 : "Sue"
  ];
 
  for(cust in custs){
    println("$cust.value : $cust.key ");
  }
 
  // ---------- METHODS ----------
  // Methods allow us to break our code into parts and also
  // allow us to reuse code
 
  sayHello();
 
  // Pass parameters
  println("5 + 4 = " + getSum(5,4));
 
  // Demonstrate pass by value
  def myName = "Derek";
  passByValue(myName);
  println("In Main : " + myName);
 
  // Pass a list for doubling
  def listToDouble = [1,2,3,4];
  listToDouble = doubleList(listToDouble);
  println(listToDouble);
 
  // Pass unknown number of elements to a method
  def nums = sumAll(1,2,3,4);
  println("Sum : " + nums);
 
  // Calculate factorial (Recursion)
  def fact4 = factorial(4);
  println("Factorial 4 : " + fact4);
 
  // ---------- CLOSURES ----------
  // Closures represent blocks of code that can except parameters
  // and can be passed into methods.
 
  // Alternative factorial using a closure
  // num is the excepted parameter and call can call for
  // the code to be executed
  def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
  println("Factorial 4 : " + getFactorial(4));
 
  // A closure can access values outside of it
  def greeting = "Goodbye";
  def sayGoodbye = {theName -> println("$greeting $theName")}
 
  sayGoodbye("Derek");
 
  // each performs an operation on each item in list
  def numList = [1,2,3,4];
  numList.each { println(it); }
 
  // Do the same with a map
  def employees = [
    'Paul' : 34,
    'Sally' : 35,
    'Sam' : 36
  ];
 
  employees.each { println("${it.key} : ${it.value}"); }
 
  // Print only evens
  def randNums = [1,2,3,4,5,6];
  randNums.each {num -> if(num % 2 == 0) println(num);}
 
  // find returns a match
  def nameList = ['Doug', 'Sally', 'Sue'];
  def matchEle = nameList.find {item -> item == 'Sue'}
  println(matchEle);
 
  // findAll finds all matches
  def randNumList = [1,2,3,4,5,6];
  def numMatches = randNumList.findAll {item -> item > 4}
  println(numMatches);
 
  // any checks if any item matches
  println("> 5 : " + randNumList.any {item -> item > 5});
 
  // every checks that all items match
  println("> 1 : " + randNumList.every {item -> item > 1});
 
  // collect performs operations on every item
  println("Double : " + randNumList.collect { item -> item * 2});
 
  // pass closure to a method
  def getEven = {num -> return(num % 2 == 0)}
  def evenNums = listEdit(randNumList, getEven);
  println("Evens : " + evenNums);
 
  // ---------- FILE IO ----------
 
  // Open a file, read each line and output them
  new File("test.txt").eachLine {
    line -> println "$line";
  }
 
  // Overwrite the file
  new File("test.txt").withWriter('utf-8') {
    writer -> writer.writeLine("Line 4");
  }
 
  // Append the file
  File file = new File("test.txt");
  file.append('Line 5');
 
  // Get the file as a string
  println(file.text);
 
  // Get the file size
  println("File Size : ${file.length()} bytes");
 
  // Check if a file or directory
  println("File : ${file.isFile()}");
  println("Dir : ${file.isDirectory()}");
 
  // Copy file to another file
  def newFile = new File("test2.txt");
  newFile << file.text;
 
  // Delete a file
  newFile.delete();
 
  // Get directory files
  def dirFiles = new File("").listRoots();
  dirFiles.each {
    item -> println file.absolutePath;
  }
 
  // ---------- OOP ----------
  // Classes are blueprints that are used to define objects
  // Every object has attributes (fields) and capabilities
  // (methods)
 
  // Create an Animal object with named parameters
  // def king = new Animal(name : 'King', sound : 'Growl');
  // or with a Constructor
  def king = new Animal('King', 'Growl');
 
  println("${king.name} says ${king.sound}");
 
  // Change an object attribute with a setter
  king.setSound('Grrrr');
  println("${king.name} says ${king.sound}");
 
  king.run();
 
  println(king.toString());
 
  // With inheritance a class can inherit all fields
  // and methods of another class
  def grover = new Dog('Grover', 'Grrrrr', 'Derek');
 
  king.makeSound();
  grover.makeSound();
 
  // Mammal inherits from the abstract class Thing
  def hamster = new Mammal('Furry');
  hamster.getInfo();
 
  // ---------- EXCEPTION HANDLING ----------
  // Handles runtime errors
 
  try {
    File testFile;
    testFile.append('Line 5');
  }
  catch(NullPointerException ex){
 
    // Prints exception
    println(ex.toString());
 
    // Prints error message
    println(ex.getMessage());
  }
  catch(Exception ex){
    println("I Catch Everything");
  }
  finally {
    println("I perform clean up")
  }
 
 
}
 
// ---------- METHODS ----------
 
// Define them with def and static which means it is shared
// by all instances of the class
static def sayHello() {
  println("Hello");
}
 
// Methods can receive parameters that have default values
static def getSum(num1=0, num2=0){
  return num1 + num2;
}
 
// Any object passed to a method is pass by value
static def passByValue(name){
 
  // name here is local to the function and can't
  // be accessed outside of it
  name = "In Function";
  println("Name : " + name);
}
 
// Receive and return a list
static def doubleList(list){
 
  // Collect performs a calculation on every item in the list
  def newList = list.collect { it * 2};
  return newList;
}
 
// Pass unknown number of elements to a method
static def sumAll(int... num){
  def sum = 0;
 
  // Performs a calculation on every item with each
  num.each { sum += it; }
  return sum;
}
 
// Calculate factorial (Recursion)
static def factorial(num){
  if(num <= 1){
    return 1;
  } else {
    return (num * factorial(num - 1));
  }
}
 
// 1st: num = 4 * factorial(3) = 4 * 6 = 24
// 2nd: num = 3 * factorial(2) = 3 * 2 = 6
// 3rd: num = 2 * factorial(1) = 2 * 1 = 2
 
// ---------- CLOSURES ----------
// pass closure to a method
 
static def listEdit(list, clo){
  return list.findAll(clo);
}
 
}
Animal.groovy

import groovy.transform.ToString;

// Creates the toString method
@ToString(includeNames=true, includeFields=true)
class Animal {
  // Fields (Attributes)
  def name;
  def sound;

  // Methods (Capabilites)

  def run(){
    println("${name} runs");
  }

  def makeSound(){
    println("${name} says ${sound}");
  }

  // Constructor Method
  def Animal(name, sound){
    this.name = name;
    this.sound = sound;
  }


}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
import groovy.transform.ToString;
 
// Creates the toString method
@ToString(includeNames=true, includeFields=true)
class Animal {
  // Fields (Attributes)
  def name;
  def sound;
 
  // Methods (Capabilites)
 
  def run(){
    println("${name} runs");
  }
 
  def makeSound(){
    println("${name} says ${sound}");
  }
 
  // Constructor Method
  def Animal(name, sound){
    this.name = name;
    this.sound = sound;
  }
 
 
}
Dog.groovy

class Dog extends Animal{
  def owner;

  // Constructor Method
  def Dog(name, sound, owner){

    // Call the Animal constructor
    super(name, sound);
    this.owner = owner;
  }

  // Overwrite the Animal makeSound()
  def makeSound(){
    println("${name} says bark and ${sound}");
  }
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
class Dog extends Animal{
  def owner;
 
  // Constructor Method
  def Dog(name, sound, owner){
 
    // Call the Animal constructor
    super(name, sound);
    this.owner = owner;
  }
 
  // Overwrite the Animal makeSound()
  def makeSound(){
    println("${name} says bark and ${sound}");
  }
}
Thing.groovy

// An Abstract class can't be instantiated, but it
// can contain fields, and abstract or concrete methods

abstract class Thing{
  public String name;
  public Thing() {}

  def getInfo(){
    println("The things name is ${name}");
  }
}
1
2
3
4
5
6
7
8
9
10
11
// An Abstract class can't be instantiated, but it
// can contain fields, and abstract or concrete methods
 
abstract class Thing{
  public String name;
  public Thing() {}
 
  def getInfo(){
    println("The things name is ${name}");
  }
}
Mammal.groovy

class Mammal extends Thing{
  def Mammal(name){
    this.name = name;
  }
}
1
2
3
4
5
class Mammal extends Thing{
  def Mammal(name){
    this.name = name;
  }
}
Widget.groovy

// An interface defines a contract that says any
// object that inherits from it will implement
// the methods defined by it
// All methods are abstract
class Widget {

  // Define abstract method that returns nothing
  void doSomething();
}
1
2
3
4
5
6
7
8
9
// An interface defines a contract that says any
// object that inherits from it will implement
// the methods defined by it
// All methods are abstract
class Widget {
 
  // Define abstract method that returns nothing
  void doSomething();
}
One Response to “Groovy Tutorial”
Gaby StewartJune 10, 2019 at 9:37 amI saw a few typos in the comments:math section “cynamically”-> “dynamically”
closures section “except” -> “accept”
reply
Leave a Reply
Your email address will not be published.

Comment 

Name

Email

Website

search
 
 

buy me a cup of coffee
"Donations help me to keep the site running. One dollar is greatly appreciated." - (Pay Pal Secured)
 