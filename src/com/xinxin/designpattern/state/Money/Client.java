package com.xinxin.designpattern.state.Money;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new PublishState());

        context.acceptOrderEvent(context);

        context.payOrderEvent(context);

        try {
        	context.checkFailEvent(context);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

    }
}
