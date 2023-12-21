public enum Fruit {

	APPLE("りんご", 1), ORANGE("オレンジ", 2), PEACH("もも", 3);

	private String label;
	private int id;

	private Fruit(String label, int id) { // コンストラクタはprivateで宣言
		this.label = label;
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public int getId() {
		return id;
	}
}