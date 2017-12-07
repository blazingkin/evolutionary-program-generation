package in.blazingk.evolutionary.nodes;

import in.blazingk.evolutionary.value.Context;
import in.blazingk.evolutionary.value.Type;
import in.blazingk.evolutionary.value.Value;

public class IfNode implements Node {

	public Node condition, block, elseBlock;

	public IfNode(Node condition, Node block, Node elseBlock){
		this.condition = condition;
		this.block = block;
		this.elseBlock = elseBlock;
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "If";
	}

	@Override
	public Value execute(Context con) {
		Value cond = condition.execute(con);
		if (cond.truthy()){
			return block.execute(new Context(con));
		}else{
			return elseBlock.execute(new Context(con));
		}
	}
	
	
	
}
