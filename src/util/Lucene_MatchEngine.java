/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.queryparser.flexible.core.QueryNodeException;
import org.apache.lucene.queryparser.flexible.standard.StandardQueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import tweet.User;

/**
 *
 * @author 13982
 */
public class Lucene_MatchEngine {
        
    public void full_textMatching(ArrayList<User> users, String key) throws IOException,ParseException, QueryNodeException{
        
         Analyzer analyzer = new StandardAnalyzer();
         
          Directory index = new RAMDirectory();
          
          IndexWriterConfig config = new IndexWriterConfig(analyzer);
          IndexWriter w = new IndexWriter(index, config);
          
          for(User i: users){
              addDoc(w,i.getTweet_content());
          }
          
          w.close();
          
          //String querystr = args.length > 0 ? args[0] : key;
         // StandardQueryParser queryParserHelper = new StandardQueryParser(analyzer);
          
          //Query q =  queryParserHelper.parse(key,"content");
          
          
          
          int hitsPerPage = 100;
          IndexReader reader = DirectoryReader.open(index);
          IndexSearcher searcher = new IndexSearcher(reader);
          TopDocs docs = searcher.search(q, hitsPerPage);
          ScoreDoc[] hits = docs.scoreDocs;
          
          System.out.println("Found " + hits.length + " relevent tweets.");
        for(int i=0;i<hits.length;++i) {
            int docId = hits[i].doc;
            Document d = searcher.doc(docId);
            System.out.println((i + 1) + ". " + d.get("content"));
        }

        // reader can only be closed when there
        // is no need to access the documents any more.
        reader.close();
    }
    
      private static void addDoc(IndexWriter w, String content) throws IOException {
      Document doc = new Document();
        doc.add(new TextField("content", content, Field.Store.YES));
        doc.add(new Field("content",content,TextField.Store.YES));
      
        w.addDocument(doc);
      
      }
    
}
