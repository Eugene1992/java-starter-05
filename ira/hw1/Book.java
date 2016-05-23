/**
 * Created by notebook on 18.05.2016.
 */
public class Book {

    public class Title{
        String title;
         public void serTitle(String title){
             this.title = title;
         }
        public String getTitle(){
            return title;
        }
        public void show (){
            System.out.println((this.title));
        }

    }
    public class Author{
        String author;
        public void setAuthor(String author){
            this.author = author;
        }
        public String getAuthor(){
            return author;
        }
        public void show(){
            System.out.println((this.author));
        }

    }
    public class Content{
        String content;
        public void setContent(String content){
            this.content = content;
        }
        public String getContent(){
            return content;
        }
        public void show(){
            System.out.println((this.content));
        }

    }
    public void main(String[] args) {
        Content content = new Content();
        Title title = new Title();
        Author author = new Author();

        content.setContent("The key");
        title.serTitle("Harry Potter");
        author.setAuthor("G.K.Rouling");

        content.show();
        title.show();
        author.show();

    }
}
