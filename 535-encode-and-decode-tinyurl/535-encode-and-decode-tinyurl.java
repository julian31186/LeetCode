public class Codec {
    String shortUrl = "";
    HashMap<String,String> map = new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hashCode = longUrl.hashCode();
        shortUrl = "http://tinyurl.com/" + String.valueOf(hashCode);
        System.out.println(shortUrl);
        map.put(shortUrl,longUrl);
        return shortUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));