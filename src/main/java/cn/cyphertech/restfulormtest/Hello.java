package cn.cyphertech.restfulormtest;

public class Hello {
	private long id;
    private String content;

    public Hello() {
    	this.id = 10L;
    	this.content = "hello";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
