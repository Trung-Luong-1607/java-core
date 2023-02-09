package fa.training.inheritance;

public interface IC {
	default void name() {
		System.out.println("IC");
	};
}
