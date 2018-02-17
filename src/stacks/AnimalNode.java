package stacks;

public abstract class AnimalNode {

	static int globalSequenceNumber;
	private String name;
	private int localSequenceNumber;

	public AnimalNode() {
		AnimalNode.globalSequenceNumber = 1;
	}

	protected AnimalNode(String name) {
		this.setLocalSequenceNumber(AnimalNode.globalSequenceNumber);
		this.setName(name);
		AnimalNode.globalSequenceNumber++;
	}

	public int getLocalSequenceNumber() {
		return localSequenceNumber;
	}

	public void setLocalSequenceNumber(int localSequenceNumber) {
		this.localSequenceNumber = localSequenceNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOlderThan(AnimalNode a) {
		return this.localSequenceNumber > a.getLocalSequenceNumber();
	}
}
