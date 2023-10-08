// Step 4: Client Code
public class Main {
    public static void main(String[] args) {
        Post post = new TextPost("Hello, Guzal!");

        Post postWithEmoji = new EmojiDecorator(post, "😃");
        Post postWithBackground = new BackgroundDecorator(postWithEmoji, "Nature");

        System.out.println("Original Post: " + post.getContent());
        System.out.println("Post with Emoji: " + postWithEmoji.getContent());
        System.out.println("Post with Background: " + postWithBackground.getContent());
    }
}