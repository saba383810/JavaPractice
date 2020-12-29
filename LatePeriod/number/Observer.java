package number;

//オブザーバーのインタフェース

import idle.Subject;

public interface Observer {
	
	//updateメソッド（対象者が知らせてくるメソッド）
    public abstract void update(NumberGenerator generator);
}
