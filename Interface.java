import java.util.List;

interface Interface {
    public String getTextFromFile(String path);
    public String lowerCase(String text);
    public String wordsSeparate(String text);
    public List<String> wordsWithMore4Letters(String[] words);
}