package moon.springboot.web.entity;
/** 
* @author 作者 moonlight 
* @version 创建时间：2018年7月22日 下午3:35:46 
* 类说明 :
*/
public class User {

	private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
