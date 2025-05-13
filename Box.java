package projec2;




class Box <T>{
    private T content;
    
    public void setContent(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box stringBox = new Box();
        stringBox.setContent("Hello");
        String value = (String) stringBox.getContent();
        System.out.println(value);
        
        
        // Problem: No type safety - can add any type
        stringBox.setContent("123");  // No compile-time error
        String badValue = (String) stringBox.getContent();
        System.out.println(badValue);// Runtime ClassCastException
    }
}


