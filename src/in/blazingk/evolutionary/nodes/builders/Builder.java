package in.blazingk.evolutionary.nodes.builders;

import java.util.ArrayList;

import in.blazingk.evolutionary.strategies.Decision;

public enum Builder {
	Generic(new GenericBuilder(), null),
	BlockNode(new BuildBlockNode(), Decision.BlockThreshold);
	
	public final NodeBuilder builder;
	public final Decision threshold;
	Builder(NodeBuilder nb, Decision threshold){
		builder = nb;
		this.threshold = threshold;
	}
	
	public static ArrayList<Builder> nonGeneric = new ArrayList<Builder>();
	static {
		for (Builder b : values()){
			if (b != Generic){
				nonGeneric.add(b);
			}
		}
	}
	
}
