class BackgroundDecorator extends PostDecorator {
    private String backgroundColor;

    public BackgroundDecorator(Post decoratedPost, String backgroundColor) {
        super(decoratedPost);
        this.backgroundColor = backgroundColor;
    }

    public String getContent() {
        return decoratedPost.getContent() + "\nBackground Color: " + backgroundColor;
    }
}

