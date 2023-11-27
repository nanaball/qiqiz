package generic02_multi;

public class Twin<T, M> {

	private T kind;
	private M model;
	
	// alt + s + r
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	// alt + s + s +s
	@Override
	public String toString() {
		return "Twin [kind=" + kind + ", model=" + model + "]";
	}
	
	
	
}
