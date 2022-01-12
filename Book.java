public class Book

{
  // Fields/Instance Data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardCover;

  // Constructor
  public Book(String t, String a, int y, int n, boolean h) {
    setTitle(t);
    setAuthor(a);
    setYear(y);
    setNumPages(n);
    setHardCover(h);
  }

  //Overloading the Constructor
  public Book(){
    this("none", "unknown", 1900, 1, false);
  }

  // Accessor Methods
public String getTitle(){
  return title;
}

public String getAuthor(){
  return author;
}

public int getYear(){
  return year;
}

public int getNumPages(){
  return numPages;
}

public boolean getHardCover(){
  return hardCover;
}

//Mutator Methods - setter Methods
public void setTitle(String s){
title = s;
}

public void setAuthor(String s){
author = s;
}

public void setYear(int s){
year = s;
}

public void setNumPages(int s){
numPages = s;
}

public void setHardCover(boolean s){
hardCover = s;
}

//Other Methods
public boolean equals(Book b){
  if(this.getTitle().equals(b.getTitle())){
    return true;
  }else{
    return false;
  }
}

  // What prints for our object
  public String toString() {
    String str = "";
    str = "Title: " + title + "\nAuthor: " + author + "\nYear Published: " + year;
    str = str + "\nNumber of Pages: " + numPages + "\nHard Cover: " + hardCover;
    return str;
  }

}