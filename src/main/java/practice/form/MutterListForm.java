package practice.form;

import lombok.Data;

// 画面上での入力値を保持するFormクラス
@Data
public class MutterListForm {
	private Integer id;
	private String name;
	private String comment;
}
