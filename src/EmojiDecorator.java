class EmojiDecorator extends PostDecorator {
    private String emoji;

    public EmojiDecorator(Post decoratedPost, String emoji) {
        super(decoratedPost);
        this.emoji = emoji;
    }

    public String getContent() {
        return decoratedPost.getContent() + " " + emoji;
    }
}
