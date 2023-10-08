class BackgroundDecorator extends PostDecorator {
    private String background;

    public BackgroundDecorator(Post decoratedPost, String background) {
        super(decoratedPost);
        this.background = background;
    }

    public String getContent() {
        return decoratedPost.getContent() + "\nBackground: " + background;
    }
}
