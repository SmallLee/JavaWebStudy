package pojo;

public enum JumpType {
	ONE(1),
	TOW(2);
	private int value;
	JumpType(int value){
		this.value = value;
	}
	public static  JumpType valueOf (int value) {
		JumpType[] jumpTypes = values();
		for(JumpType jumpType : jumpTypes) {
			if (jumpType.value == value) {
				return  jumpType;
			}
		}
		throw new IllegalArgumentException("No match value");
	}
	
	public int getValue() {
		return value;
	}
}
