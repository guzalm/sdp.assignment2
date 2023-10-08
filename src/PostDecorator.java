// Step 3: Create Decorators for Post Enhancements
class PostDecorator implements Post {
    protected Post decoratedPost;

    public PostDecorator(Post decoratedPost) {
        this.decoratedPost = decoratedPost;
    }

    public String getContent() {
        return decoratedPost.getContent();
    }
}