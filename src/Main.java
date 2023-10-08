// Step 4: Client Code
public class Main {
    public static void main(String[] args) {
        Post post = new TextPost("Hello, Guzal!");

        Post postWithEmoji = new EmojiDecorator(post, "😃");
        Post postWithBackgroundColor = new BackgroundDecorator(postWithEmoji, "Blue"); // Изменили на выбранный цвет

        System.out.println("Original Post: " + post.getContent());
        System.out.println("Post with Emoji: " + postWithEmoji.getContent());
        System.out.println("Post with Background Color: " + postWithBackgroundColor.getContent());
    }
}
