package in.blazingk.evolutionary;

public class ProgramEvolution {

	public static void main(String[] args){
		parseArguments(args);
	}
	
	public static void parseArguments(String[] args){
		for (int i = 0; i < args.length; i++){
			if (args[i].equals("--seed") || args[i].equals("-s")){
				Settings.randSeed = Long.parseLong(args[++i]);
				continue;
			}
			if (args[i].equals("--gensize") || args[i].equals("-g")){
				Settings.perGeneration = Integer.parseInt(args[++i]);
				if (Settings.perGeneration <= 0){
					throw new IllegalArgumentException("Must have a positive number per generation");
				}
				continue;
			}
			if (args[i].equals("--blocklen") || args[i].equals("-b")){
				Settings.maxBlockLength = Integer.parseInt(args[++i]);
				if (Settings.maxBlockLength <= 0){
					throw new IllegalArgumentException("Blocks must have a postitive length");
				}
				continue;
			}
		}
	}
	
	
}
