public class Email extends Document {
    String sender, recipient, title;

    public void setSender(String input){
        sender = input;
    }

    public void setRecipient(String input){
        recipient = input;
    }

    public void setTitle(String input){
        title = input;
    }

    public String getSender(){
        return sender;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getTitle(){
        return title;
    }

    public String toString(){
        String result;
        StringBuilder builder = new StringBuilder();
        builder.append("Title: " + title);
        builder.append("Sender: " + sender);
        builder.append("Recipient: " + recipient);
        builder.append("Body: " + text);

        result = builder.toString();
        return result;
    }
}
