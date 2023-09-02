package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
		KHU artAndDesign = new ArtAndDesign();
		artAndDesign.whatCollege();

		KHU artAndDesignWithKTNAT = new KTNat(artAndDesign);
		artAndDesignWithKTNAT.whatCollege();

		KHU artAndDesignWithKTAndSKTNat = new KTNat(new SKTNat(new ArtAndDesign()));
		artAndDesignWithKTAndSKTNat.whatCollege();

		KHU ElectronicAndInformationWithLGAndSKTAndKTNat =
				new LGNat(new SKTNat(new KTNat( new ElectronicAndInformation())));
		ElectronicAndInformationWithLGAndSKTAndKTNat.whatCollege();
		System.out.println();

	}


}
