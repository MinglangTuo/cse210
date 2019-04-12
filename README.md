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
