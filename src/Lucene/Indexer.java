/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lucene;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat.Field;
import javax.swing.text.Document;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;






public class Indexer
{
    private IndexWriter writer;
    public Indexer(String indexDirectorypath) throws IOException
    {
        Directory indexDirectory = FSDirectory.open(new File(indexDirectorypath));
        
        writer = new IndexWriter(indexDirectory,new StandardAnalyzer(Version.LUCENE_36),true,IndexWriter.MaxFieldLength.LIMITED);
    }
    
    public void close() throws CorruptIndexException,IOException{
        writer.close();
    }
    
    private Document getDocument(File file) throws IOException{
        Document document = new Document();
        
        Field contentField = new Field(LuceneConstants.CONTENTS, new FileReader(file));
        
        Field fileNameField = new Field(LuceneConstants.FILE_NAME,file.getName(),Field.Store.YES,Field.Index.NOT_ANALYZED);
    
        Field filePathField = new Field(LuceneConstants.FILE_PATH,file.getCanonicalFile(),Field.Store.YES,Field.Index.NOT_ANALYZED);
        
        
        document.add(contentField);
        
         document.add(fileNameField);
         
         document.add(filePathField);
        
         return document;
    }
    
    public void indexFile(File file){
        
    }
    
    public int createIndex(String dataDirPath,FileFilter filter){
        
    }
    
    
}
    
    
    
    
