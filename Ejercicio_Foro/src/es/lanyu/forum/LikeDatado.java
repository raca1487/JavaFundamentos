package es.lanyu.forum;

import com.github.likes.Like;

public class LikeDatado<T extends Datable & Nombrable> extends Like<T> {

	public LikeDatado(T content, String user) {
		super(content, user);
	}

}
