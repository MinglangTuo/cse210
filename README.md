# cse210
the project using the apache POI to dispose the dataset from the excel

1.1 the taks for the assigniment:

(1) print top 10 tweets(based on the Favs and RTs) and print the relevent information about the tweet

(2)print top 10 users(users are ranked based on followers)

(3)tweet search engine based on string matching

(4)tweet search engine based on full text searching(using Lucene)

(5)javadoc comments to generate HTML javadoc

1.2 the class for the assigniment:

(1)package tweet：this package contains the Tweet.class and User.class (the information from dataset store in it)

(2)package util: this package contains three helper class. Class ExcelUtil is used for dealing with reading excel file and converting the data to the User.class. Class MergeSort.class is designed to sort the information and output the rank for the users. And final class is the MatchEngine.class, which implement the text sesarching.

(3)package main: this package contains the Main class, it can run different tasks by inputting different parameters.


1.3 the knowledge

task(1) 

It is important to use the user.class to implements Comparable to rank the arraylist and just print out the last 10 elements of list.

It's very simple.

task（2）

It needs to estimate merging the same users who have same user name and nick name. Then using the comparator to compare. And print out 
the last 10 elements of list.

task(3)

Using regular expression to extract the keyword in user.tweet_content.

task(4)

....

task(5)

javadoc..


1.4 the Test

Test the result and compare the result by using the excel


