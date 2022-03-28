import java.util.ArrayList;

public class BigNumber {

	private ArrayList<Integer> Digits = new ArrayList<Integer>();
	int Sign;

	public BigNumber(String BigNumber) {

		int a;
		String[] ch = BigNumber.split("");
		if (ch[0].equals("-")) {
			for (int j = 1; j < BigNumber.length(); j++) {

				a = Integer.parseInt(ch[j]);
				Digits.add(a);
			}

			Sign = 1;
		} else if (!ch[0].equals("-")) {
			for (int i = 0; i < BigNumber.length(); i++) {

				a = Integer.parseInt(ch[i]);
				Digits.add(a);

			}
			Sign = 0;
		}
	}

	public String toString() {
		String abc = "";
		for (int i = 0; i < Digits.size(); i++) {
			abc = abc + Digits.get(i);
		}
		return abc;
	}

	public BigNumber Minimum(BigNumber Compared) {

		if (this.compareTo(Compared) == 1) {
			if (Compared.Sign == 1) {
				System.out.print("-");
				for (int i = 0; i < Compared.Digits.size(); i++) {

					System.out.print(Compared.Digits.get(i));

				}
			} else {
//				System.out.println("lskjfl");
				for (int i = 0; i < Compared.Digits.size(); i++) {

					System.out.print(Compared.Digits.get(i));

				}
			}
		} else if (this.compareTo(Compared) == 0) {
			if (Compared.Sign == 1) {
				System.out.print("-");
				for (int i = 0; i < Compared.Digits.size(); i++) {

					System.out.print(Compared.Digits.get(i));

				}
			} else {
				for (int i = 0; i < Compared.Digits.size(); i++) {

					System.out.print(Compared.Digits.get(i));

				}
			}
		} else if (this.compareTo(Compared) == -1) {
//			System.out.println("sldjl");
			if (this.Sign == 1) {
				System.out.print("-");
				for (int i = 0; i < this.Digits.size(); i++) {

					System.out.print(this.Digits.get(i));
				}
			} else {
				for (int i = 0; i < this.Digits.size(); i++) {
//				System.out.println("cm");
					System.out.print(this.Digits.get(i));
				}
			}
		}
		return Compared;
	}

	public BigNumber Maximum(BigNumber Compared) {

		if (this.compareTo(Compared) == 1) {
			if (this.Sign == 1) {
				System.out.print("-");
				for (int i = 0; i < this.Digits.size(); i++) {

					System.out.print(this.Digits.get(i));

				}
			} else {
				for (int i = 0; i < this.Digits.size(); i++) {

					System.out.print(this.Digits.get(i));

				}
			}
		} else if (this.compareTo(Compared) == 0) {
			if (Compared.Sign == 1) {
				System.out.print("-");
				for (int i = 0; i < Compared.Digits.size(); i++) {

					System.out.print(Compared.Digits.get(i));

				}
			} else {
				for (int i = 0; i < Compared.Digits.size(); i++) {

					System.out.print(Compared.Digits.get(i));

				}
			}
		} else if (this.compareTo(Compared) == -1) {

			if (Compared.Sign == 1) {
				System.out.print("-");
				for (int i = 0; i < Compared.Digits.size(); i++) {
					System.out.print(Compared.Digits.get(i));

				}
			} else {
				for (int i = 0; i < Compared.Digits.size(); i++) {
					System.out.print(Compared.Digits.get(i));

				}

			}
		}
		return Compared;
	}

	public BigNumber Add(BigNumber Second) {
		ArrayList<Integer> Sum = new ArrayList<Integer>();
		int a, b = 0;
		int count = 0;
		String abc = "";
		if (this.Digits.size() == Second.Digits.size()) {
			if (this.Sign == Second.Sign) {
				for (int i = Digits.size() - 1; i >= 0; i--) {
					if ((this.Digits.get(i) + Second.Digits.get(i) + b) <= 9) {
						a = this.Digits.get(i) + Second.Digits.get(i) + b;
						Sum.add(a);
						b = a / 10;

					} else if ((this.Digits.get(i) + Second.Digits.get(i) + b) > 9) {

						a = this.Digits.get(i) + Second.Digits.get(i) + b;
						b = a / 10;
						a -= 10;
						Sum.add(a);
					}

				}
				if (b == 1) {

					Sum.add(1);
				}
				for (int x = 0, y = Sum.size() - 1; x < y; x++) {
					Sum.add(x, Sum.remove(y));
				}
				if (this.Sign == 1 && Second.Sign == 1) {
					System.out.print("-");
				}
				
				for (int i = 0; i < Sum.size(); i++) {
					abc = abc + Sum.get(i);
				}
				
//				for (int j = 0; j < Sum.size(); j++) {
//					System.out.print(Sum.get(j));
//				}
			} else if (this.Sign == 0 && Second.Sign == 1) {
				for (int i = Digits.size() - 1; i >= 0; i--) {
					if (this.Digits.get(0) >= Second.Digits.get(0)) {
						if (this.Digits.get(i) > Second.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count = 0;
						} else if (this.Digits.get(i) < Second.Digits.get(i)) {
							a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count++;

						} else if (this.Digits.get(i) == Second.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
								a -= 1;
								count++;
							}
							Sum.add(a);

						}
					} else if (this.Digits.get(0) < Second.Digits.get(0)) {
						if (Second.Digits.get(i) > this.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count = 0;
						} else if (Second.Digits.get(i) < this.Digits.get(i)) {
							a = (Second.Digits.get(i) + 10) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count++;

						} else if (Second.Digits.get(i) == this.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
								a -= 1;
								count++;
							}
							Sum.add(a);

						}

					}
				}

				for (int x = 0, y = Sum.size() - 1; x < y; x++) {
					Sum.add(x, Sum.remove(y));
				}
				if (this.Sign == 0 && Second.Sign == 1) {
					if (this.Digits.get(0) < Second.Digits.get(0)) {
						System.out.print("-");
					}
				}
				if (Sum.get(0) == 10) {
					Sum.remove(0);
				} else if (Sum.get(0) == 0) {
					Sum.remove(0);
				}
				for (int i = 0; i < Sum.size(); i++) {
					abc = abc + Sum.get(i);
				}
			} else if (this.Sign == 1 && Second.Sign == 0) {
				for (int i = Digits.size() - 1; i >= 0; i--) {
					if (this.Digits.get(0) <= Second.Digits.get(0)) {
						if (this.Digits.get(i) < Second.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count = 0;
						} else if (this.Digits.get(i) > Second.Digits.get(i)) {
							a = (Second.Digits.get(i) + 10) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count++;

						} else if (this.Digits.get(i) == Second.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a = (Second.Digits.get(i) + 10) - this.Digits.get(i);
								a -= 1;
								count++;
							}
							Sum.add(a);

						}
					} else if (this.Digits.get(0) > Second.Digits.get(0)) {
						if (this.Digits.get(i) > Second.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count = 0;
						} else if (Second.Digits.get(i) > this.Digits.get(i)) {
							a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sum.add(a);
							count++;

						} else if (Second.Digits.get(i) == this.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
								a -= 1;
								count++;
							}
							Sum.add(a);

						}

					}
				}

				for (int x = 0, y = Sum.size() - 1; x < y; x++) {
					Sum.add(x, Sum.remove(y));
				}
				if (this.Sign == 1 && Second.Sign == 0) {
					if (this.Digits.get(0) > Second.Digits.get(0)) {
						System.out.print("-");
					}
				}
				if (Sum.get(0) == 10) {
					Sum.remove(0);
				} else if (Sum.get(0) == 0) {
					Sum.remove(0);
				}
				for (int i = 0; i < Sum.size(); i++) {
					abc = abc + Sum.get(i);
				}
			}
		}
		return new BigNumber(abc);

	}

	public BigNumber Substract(BigNumber Second) {
		int a = 0;
		int b = 0;
		int count = 0;
		String abc = "";
		ArrayList<Integer> Sub = new ArrayList<Integer>();

		if (this.Digits.size() == Second.Digits.size()) {
			if (this.Sign == 0 && Second.Sign == 0) {
				for (int i = Digits.size() - 1; i >= 0; i--) {
					if (this.Digits.get(0) >= Second.Digits.get(0)) {
						if (this.Digits.get(i) > Second.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count = 0;
						} else if (this.Digits.get(i) < Second.Digits.get(i)) {
							a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count++;

						} else if (this.Digits.get(i) == Second.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
								a -= 1;
								count++;
							}
							Sub.add(a);

						}
					} else if (this.Digits.get(0) < Second.Digits.get(0)) {
						if (Second.Digits.get(i) > this.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count = 0;
						} else if (Second.Digits.get(i) < this.Digits.get(i)) {
							a = (Second.Digits.get(i) + 10) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count++;

						} else if (Second.Digits.get(i) == this.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a = (Second.Digits.get(i) + 10) - this.Digits.get(i);
								a -= 1;
								count++;
							}
							Sub.add(a);

						}

					}
				}

				for (int x = 0, y = Sub.size() - 1; x < y; x++) {
					Sub.add(x, Sub.remove(y));
				}
				if (this.Sign == 0 && Second.Sign == 0) {
					if (this.Digits.get(0) < Second.Digits.get(0)) {
						System.out.print("-");
					}
				}
				if (Sub.get(0) == 10) {
					Sub.remove(0);
				} else if (Sub.get(0) == 0) {
					Sub.remove(0);
				}
				for (int i = 0; i < Sub.size(); i++) {
					abc = abc + Sub.get(i);
				}
			} else if (this.Sign == 1 && Second.Sign == 1) {
				for (int i = Digits.size() - 1; i >= 0; i--) {
					if (this.Digits.get(0) <= Second.Digits.get(0)) {
						if (this.Digits.get(i) < Second.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count = 0;
						} else if (this.Digits.get(i) > Second.Digits.get(i)) {
							a = (Second.Digits.get(i) + 10) - this.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count++;

						} else if (this.Digits.get(i) == Second.Digits.get(i)) {
							a = Second.Digits.get(i) - this.Digits.get(i);
							if (count > 0) {
								a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
								a -= 1;
								count++;
							}
							Sub.add(a);

						}
					} else if (this.Digits.get(0) > Second.Digits.get(0)) {
						if (this.Digits.get(i) > Second.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count = 0;
						} else if (Second.Digits.get(i) > this.Digits.get(i)) {
							a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
							if (count > 0) {
								a -= 1;
							}
							Sub.add(a);
							count++;

						} else if (Second.Digits.get(i) == this.Digits.get(i)) {
							a = this.Digits.get(i) - Second.Digits.get(i);
							if (count > 0) {
								a = (this.Digits.get(i) + 10) - Second.Digits.get(i);
								a -= 1;
								count++;
							}
							Sub.add(a);

						}

					}
				}

				for (int x = 0, y = Sub.size() - 1; x < y; x++) {
					Sub.add(x, Sub.remove(y));
				}
				if (this.Sign == 1 && Second.Sign == 1) {
					if (this.Digits.get(0) > Second.Digits.get(0)) {
						System.out.print("-");
					}
				}
				if (Sub.get(0) == 10) {
					Sub.remove(0);
				} else if (Sub.get(0) == 0) {
					Sub.remove(0);
				}
				for (int i = 0; i < Sub.size(); i++) {
					abc = abc + Sub.get(i);
				}
			} else if ((this.Sign == 1 && Second.Sign == 0) || (this.Sign == 0 && Second.Sign == 1)){
				for (int i = Digits.size() - 1; i >= 0; i--) {
					if ((this.Digits.get(i) + Second.Digits.get(i) + b) <= 9) {
						a = this.Digits.get(i) + Second.Digits.get(i) + b;
						Sub.add(a);
						b = a / 10;

					} else if ((this.Digits.get(i) + Second.Digits.get(i) + b) > 9) {

						a = this.Digits.get(i) + Second.Digits.get(i) + b;
						b = a / 10;
						a -= 10;
						Sub.add(a);
					}

				}
				if (b == 1) {

					Sub.add(1);
				}
				for (int x = 0, y = Sub.size() - 1; x < y; x++) {
					Sub.add(x, Sub.remove(y));
				}
				if (this.Sign == 1 && Second.Sign == 0) {
					System.out.print("-");
				}
				for (int i = 0; i < Sub.size(); i++) {
					abc = abc + Sub.get(i);
				}
			}
		}
		return new BigNumber(abc);	
		}

	public int compareTo(BigNumber Second) {
		int returnnumber = 99;
		if (this.Sign == 0 && Second.Sign == 0) {
			if (this.Digits.size() == Second.Digits.size()) {
				for (int i = 0; i < Digits.size(); i++) {

					if (this.Digits.get(i) > Second.Digits.get(i)) {
//						System.out.println("alkýn");
						returnnumber = 1;

//						System.out.println(returnnumber);
						break;
					}

					else if (this.Digits.get(i) < Second.Digits.get(i)) {
//						System.out.println("b");
						returnnumber = -1;
//						System.out.println(returnnumber);
						break;
					}

					else if (this.Digits.get(i) == Second.Digits.get(i)) {

						if (i == Digits.size() - 1) {
							returnnumber = 0;
//							System.out.println(returnnumber);
						}
					}
				}
			} else if (this.Digits.size() < Second.Digits.size()) {
//			second > this
				return -1;
			}

			else if (this.Digits.size() > Second.Digits.size()) {
//			this > second
				return 1;
			}

		} else if (this.Sign == 1 && Second.Sign == 0) {
			return -1;
		} else if (this.Sign == 0 && Second.Sign == 1) {
			return 1;
		} else if (this.Sign == 1 && Second.Sign == 1) {
			if (this.Digits.size() == Second.Digits.size()) {
				for (int i = 0; i < Digits.size(); i++) {
					if (this.Digits.get(i) < Second.Digits.get(i)) {

						returnnumber = 1;
//						System.out.println(returnnumber);
						break;
					}

					if (this.Digits.get(i) > Second.Digits.get(i)) {

						returnnumber = -1;
//						System.out.println(returnnumber);
						break;
					}

					if (this.Digits.get(i) == Second.Digits.get(i)) {
						if (i == Digits.size() - 1) {
							returnnumber = 0;
//							System.out.println(returnnumber);
						}
					}
				}
			} else if (this.Digits.size() > Second.Digits.size()) {
//			second > this
				return -1;
			}

			else if (this.Digits.size() < Second.Digits.size()) {
//			this > second
				return 1;
			}
		}

		return returnnumber;
	}

	public ArrayList<Integer> getDigits() {
		return Digits;
	}

	public void setDigits(ArrayList<Integer> digits) {
		Digits = digits;
	}

	public int getSign() {
		return Sign;
	}

	public void setSign(int sign) {
		Sign = sign;
	}

}
