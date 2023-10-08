// Step 2: Create Concrete Components (Base Post Types)
class TextPost implements Post {
    private String content;

    public TextPost(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
