package ru.razornd.ml.titanic.randomforest;

import ru.razornd.ml.titanic.model.Passenger;
import ru.razornd.ml.titanic.model.PortEmbrkationEncoder;
import ru.razornd.ml.titanic.model.Sex;

public class TitanicClassifier {
    private static int predict_0(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 29.356250762939453) {
                    if (features[2] <= 37.0) {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 34;
                        } else {
                            if (features[2] <= 25.5) {
                                classes[0] = 0;
                                classes[1] = 8;
                            } else {
                                classes[0] = 2;
                                classes[1] = 9;
                            }
                        }
                    } else {
                        if (features[5] <= 13.25) {
                            classes[0] = 3;
                            classes[1] = 7;
                        } else {
                            if (features[5] <= 25.964599609375) {
                                classes[0] = 0;
                                classes[1] = 10;
                            } else {
                                classes[0] = 2;
                                classes[1] = 5;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 149.035400390625) {
                        classes[0] = 0;
                        classes[1] = 89;
                    } else {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 7;
                        } else {
                            classes[0] = 2;
                            classes[1] = 4;
                        }
                    }
                }
            } else {
                if (features[5] <= 7.820849895477295) {
                    if (features[5] <= 7.491650104522705) {
                        classes[0] = 1;
                        classes[1] = 8;
                    } else {
                        classes[0] = 1;
                        classes[1] = 21;
                    }
                } else {
                    if (features[2] <= 5.5) {
                        if (features[2] <= 3.0) {
                            classes[0] = 3;
                            classes[1] = 4;
                        } else {
                            classes[0] = 0;
                            classes[1] = 10;
                        }
                    } else {
                        if (features[5] <= 24.808349609375) {
                            if (features[4] <= 0.5) {
                                if (features[6] <= 1.5) {
                                    classes[0] = 3;
                                    classes[1] = 9;
                                } else {
                                    if (features[5] <= 9.833349227905273) {
                                        classes[0] = 17;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 25.0) {
                                            classes[0] = 5;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 3;
                                        }
                                    }
                                }
                            } else {
                                if (features[5] <= 15.972900390625) {
                                    classes[0] = 1;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 5;
                                }
                            }
                        } else {
                            if (features[3] <= 2.5) {
                                classes[0] = 6;
                                classes[1] = 1;
                            } else {
                                classes[0] = 10;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    if (features[2] <= 8.5) {
                        classes[0] = 0;
                        classes[1] = 22;
                    } else {
                        classes[0] = 2;
                        classes[1] = 5;
                    }
                } else {
                    classes[0] = 8;
                    classes[1] = 1;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[5] <= 37.0) {
                        if (features[2] <= 36.5) {
                            if (features[2] <= 30.849559783935547) {
                                if (features[5] <= 28.710399627685547) {
                                    classes[0] = 8;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 7;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 12;
                            }
                        } else {
                            if (features[5] <= 27.135398864746094) {
                                classes[0] = 6;
                                classes[1] = 3;
                            } else {
                                classes[0] = 9;
                                classes[1] = 1;
                            }
                        }
                    } else {
                        if (features[3] <= 0.5) {
                            if (features[5] <= 69.05419921875) {
                                classes[0] = 19;
                                classes[1] = 0;
                            } else {
                                classes[0] = 13;
                                classes[1] = 2;
                            }
                        } else {
                            if (features[5] <= 59.087501525878906) {
                                classes[0] = 3;
                                classes[1] = 8;
                            } else {
                                if (features[2] <= 37.0) {
                                    classes[0] = 10;
                                    classes[1] = 1;
                                } else {
                                    if (features[5] <= 81.5625) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[6] <= 0.5) {
                        if (features[2] <= 22.5) {
                            classes[0] = 4;
                            classes[1] = 3;
                        } else {
                            if (features[2] <= 29.849559783935547) {
                                if (features[2] <= 28.75) {
                                    classes[0] = 14;
                                    classes[1] = 1;
                                } else {
                                    if (features[5] <= 7.5625) {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 5;
                                    }
                                }
                            } else {
                                classes[0] = 13;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[2] <= 26.5) {
                            if (features[5] <= 8.104150772094727) {
                                if (features[5] <= 7.987500190734863) {
                                    if (features[2] <= 24.5) {
                                        classes[0] = 33;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 65;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[2] <= 27.5) {
                                classes[0] = 4;
                                classes[1] = 3;
                            } else {
                                if (features[5] <= 13.25) {
                                    if (features[5] <= 7.910400390625) {
                                        if (features[6] <= 1.5) {
                                            classes[0] = 19;
                                            classes[1] = 4;
                                        } else {
                                            if (features[2] <= 31.5) {
                                                classes[0] = 43;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 39.0) {
                                                    classes[0] = 5;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 46.0) {
                                            if (features[2] <= 37.5) {
                                                if (features[0] <= 2.5) {
                                                    classes[0] = 16;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 8.081250190734863) {
                                                        if (features[2] <= 30.75) {
                                                            classes[0] = 17;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 5;
                                                            classes[1] = 4;
                                                        }
                                                    } else {
                                                        if (features[5] <= 9.491649627685547) {
                                                            classes[0] = 4;
                                                            classes[1] = 3;
                                                        } else {
                                                            classes[0] = 4;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 6;
                                            }
                                        } else {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    if (features[2] <= 32.5) {
                                        if (features[2] <= 29.849559783935547) {
                                            classes[0] = 25;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 3;
                                        }
                                    } else {
                                        classes[0] = 45;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_1(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 28.856250762939453) {
                    if (features[2] <= 49.5) {
                        if (features[3] <= 0.5) {
                            if (features[5] <= 13.25) {
                                if (features[5] <= 12.675000190734863) {
                                    classes[0] = 0;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 10;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 22;
                            }
                        } else {
                            if (features[2] <= 27.5) {
                                classes[0] = 4;
                                classes[1] = 8;
                            } else {
                                if (features[2] <= 30.5) {
                                    classes[0] = 0;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 5;
                                }
                            }
                        }
                    } else {
                        classes[0] = 3;
                        classes[1] = 4;
                    }
                } else {
                    if (features[2] <= 16.5) {
                        classes[0] = 2;
                        classes[1] = 5;
                    } else {
                        classes[0] = 0;
                        classes[1] = 82;
                    }
                }
            } else {
                if (features[5] <= 32.881248474121094) {
                    if (features[2] <= 29.849559783935547) {
                        if (features[5] <= 22.904150009155273) {
                            if (features[5] <= 15.372900009155273) {
                                if (features[5] <= 13.464599609375) {
                                    if (features[5] <= 10.79789924621582) {
                                        if (features[5] <= 7.987500190734863) {
                                            if (features[6] <= 1.5) {
                                                if (features[5] <= 7.743750095367432) {
                                                    classes[0] = 1;
                                                    classes[1] = 4;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 12;
                                                }
                                            } else {
                                                if (features[2] <= 24.0) {
                                                    classes[0] = 3;
                                                    classes[1] = 7;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 3;
                                                }
                                            }
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 6;
                                    }
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[6] <= 1.5) {
                                    classes[0] = 0;
                                    classes[1] = 12;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 7;
                                }
                            }
                        } else {
                            classes[0] = 11;
                            classes[1] = 4;
                        }
                    } else {
                        if (features[5] <= 9.53125) {
                            classes[0] = 11;
                            classes[1] = 1;
                        } else {
                            classes[0] = 8;
                            classes[1] = 5;
                        }
                    }
                } else {
                    classes[0] = 14;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    if (features[5] <= 19.65625) {
                        classes[0] = 2;
                        classes[1] = 7;
                    } else {
                        classes[0] = 0;
                        classes[1] = 19;
                    }
                } else {
                    if (features[5] <= 35.537498474121094) {
                        classes[0] = 12;
                        classes[1] = 1;
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[2] <= 45.25) {
                        if (features[2] <= 43.5) {
                            if (features[6] <= 1.5) {
                                if (features[5] <= 7.745850086212158) {
                                    if (features[2] <= 22.75) {
                                        classes[0] = 5;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 35;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[6] <= 0.5) {
                                        classes[0] = 6;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 21;
                                        classes[1] = 6;
                                    }
                                }
                            } else {
                                if (features[5] <= 7.86460018157959) {
                                    if (features[5] <= 7.133349895477295) {
                                        if (features[5] <= 7.01039981842041) {
                                            classes[0] = 12;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 20;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[2] <= 20.75) {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        } else {
                                            if (features[2] <= 27.5) {
                                                if (features[2] <= 24.5) {
                                                    classes[0] = 4;
                                                    classes[1] = 4;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 3;
                                                }
                                            } else {
                                                if (features[5] <= 7.712500095367432) {
                                                    classes[0] = 9;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[0] <= 2.5) {
                                        if (features[2] <= 29.349559783935547) {
                                            if (features[2] <= 20.0) {
                                                classes[0] = 8;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 22;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[2] <= 34.5) {
                                                if (features[2] <= 30.5) {
                                                    classes[0] = 10;
                                                    classes[1] = 2;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 4;
                                                }
                                            } else {
                                                classes[0] = 12;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 8.831250190734863) {
                                            if (features[2] <= 20.5) {
                                                classes[0] = 10;
                                                classes[1] = 2;
                                            } else {
                                                if (features[5] <= 8.081250190734863) {
                                                    if (features[2] <= 35.5) {
                                                        classes[0] = 41;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 1;
                                                    }
                                                } else {
                                                    classes[0] = 7;
                                                    classes[1] = 2;
                                                }
                                            }
                                        } else {
                                            classes[0] = 49;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 4;
                            classes[1] = 5;
                        }
                    } else {
                        classes[0] = 45;
                        classes[1] = 0;
                    }
                } else {
                    if (features[3] <= 1.5) {
                        if (features[0] <= 2.5) {
                            if (features[5] <= 30.597900390625) {
                                if (features[5] <= 29.850000381469727) {
                                    if (features[2] <= 53.0) {
                                        if (features[5] <= 27.135398864746094) {
                                            classes[0] = 1;
                                            classes[1] = 8;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                }
                            } else {
                                if (features[5] <= 52.277099609375) {
                                    if (features[2] <= 30.349559783935547) {
                                        classes[0] = 11;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 22;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[5] <= 67.17915344238281) {
                                        if (features[2] <= 34.0) {
                                            classes[0] = 1;
                                            classes[1] = 7;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        if (features[6] <= 1.0) {
                                            if (features[3] <= 0.5) {
                                                classes[0] = 4;
                                                classes[1] = 4;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 3;
                                            }
                                        } else {
                                            if (features[5] <= 81.1624984741211) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 8;
                        }
                    } else {
                        classes[0] = 13;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_2(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 143.59164428710938) {
                    if (features[2] <= 37.0) {
                        classes[0] = 0;
                        classes[1] = 102;
                    } else {
                        if (features[2] <= 44.5) {
                            if (features[3] <= 0.5) {
                                classes[0] = 3;
                                classes[1] = 12;
                            } else {
                                classes[0] = 4;
                                classes[1] = 5;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 29;
                        }
                    }
                } else {
                    classes[0] = 3;
                    classes[1] = 8;
                }
            } else {
                if (features[6] <= 1.5) {
                    if (features[5] <= 15.620849609375) {
                        if (features[5] <= 8.083349227905273) {
                            if (features[2] <= 21.5) {
                                classes[0] = 4;
                                classes[1] = 4;
                            } else {
                                classes[0] = 4;
                                classes[1] = 17;
                            }
                        } else {
                            if (features[5] <= 14.852049827575684) {
                                classes[0] = 5;
                                classes[1] = 2;
                            } else {
                                classes[0] = 3;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 11;
                    }
                } else {
                    if (features[5] <= 20.799999237060547) {
                        if (features[5] <= 7.762499809265137) {
                            classes[0] = 2;
                            classes[1] = 7;
                        } else {
                            if (features[4] <= 0.5) {
                                if (features[3] <= 0.5) {
                                    if (features[2] <= 26.5) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 4;
                                    }
                                } else {
                                    classes[0] = 14;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 3;
                                classes[1] = 7;
                            }
                        }
                    } else {
                        if (features[4] <= 3.5) {
                            classes[0] = 19;
                            classes[1] = 0;
                        } else {
                            classes[0] = 6;
                            classes[1] = 1;
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[2] <= 53.0) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 10;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 27.135398864746094) {
                            classes[0] = 1;
                            classes[1] = 15;
                        } else {
                            if (features[2] <= 47.5) {
                                if (features[2] <= 41.0) {
                                    if (features[2] <= 31.5) {
                                        if (features[2] <= 27.5) {
                                            if (features[5] <= 115.441650390625) {
                                                classes[0] = 2;
                                                classes[1] = 8;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            if (features[5] <= 38.95000076293945) {
                                                classes[0] = 7;
                                                classes[1] = 5;
                                            } else {
                                                classes[0] = 13;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 9;
                                    }
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 4;
                                classes[1] = 9;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 59.0) {
                        classes[0] = 11;
                        classes[1] = 0;
                    } else {
                        classes[0] = 10;
                        classes[1] = 3;
                    }
                }
            } else {
                if (features[2] <= 3.5) {
                    classes[0] = 3;
                    classes[1] = 10;
                } else {
                    if (features[5] <= 7.910400390625) {
                        if (features[2] <= 29.349559783935547) {
                            if (features[2] <= 26.5) {
                                if (features[3] <= 0.5) {
                                    if (features[5] <= 7.150000095367432) {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    } else {
                                        if (features[2] <= 21.5) {
                                            if (features[2] <= 20.5) {
                                                classes[0] = 12;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 23;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 1;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 3;
                            }
                        } else {
                            if (features[5] <= 7.762499809265137) {
                                classes[0] = 72;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 7.862500190734863) {
                                    classes[0] = 8;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 26;
                                    classes[1] = 0;
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 32.5) {
                            if (features[2] <= 30.75) {
                                if (features[2] <= 20.5) {
                                    if (features[3] <= 1.5) {
                                        if (features[3] <= 0.5) {
                                            if (features[5] <= 8.481250762939453) {
                                                classes[0] = 8;
                                                classes[1] = 5;
                                            } else {
                                                if (features[5] <= 10.172900199890137) {
                                                    classes[0] = 10;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 11.987500190734863) {
                                                        classes[0] = 4;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 4;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 8;
                                        }
                                    } else {
                                        classes[0] = 15;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[2] <= 25.5) {
                                        classes[0] = 35;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 8.081250190734863) {
                                            classes[0] = 23;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 10.0) {
                                                if (features[2] <= 29.349559783935547) {
                                                    classes[0] = 3;
                                                    classes[1] = 5;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 3;
                                                }
                                            } else {
                                                if (features[6] <= 1.5) {
                                                    if (features[5] <= 20.233348846435547) {
                                                        classes[0] = 7;
                                                        classes[1] = 5;
                                                    } else {
                                                        classes[0] = 10;
                                                        classes[1] = 2;
                                                    }
                                                } else {
                                                    if (features[5] <= 40.98125076293945) {
                                                        if (features[0] <= 2.5) {
                                                            classes[0] = 9;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 15;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[5] <= 20.924999237060547) {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 6;
                                }
                            }
                        } else {
                            if (features[5] <= 13.25) {
                                if (features[2] <= 40.5) {
                                    if (features[2] <= 34.5) {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 11;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 4;
                                }
                            } else {
                                classes[0] = 39;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_3(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 37.0) {
                    if (features[2] <= 7.5) {
                        classes[0] = 3;
                        classes[1] = 6;
                    } else {
                        if (features[5] <= 13.39585018157959) {
                            if (features[2] <= 28.5) {
                                classes[0] = 1;
                                classes[1] = 8;
                            } else {
                                classes[0] = 0;
                                classes[1] = 10;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 82;
                        }
                    }
                } else {
                    if (features[5] <= 40.095848083496094) {
                        if (features[5] <= 25.964599609375) {
                            if (features[5] <= 14.375) {
                                classes[0] = 5;
                                classes[1] = 4;
                            } else {
                                classes[0] = 0;
                                classes[1] = 11;
                            }
                        } else {
                            classes[0] = 6;
                            classes[1] = 4;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 37;
                    }
                }
            } else {
                if (features[3] <= 2.5) {
                    if (features[2] <= 38.5) {
                        if (features[5] <= 15.620849609375) {
                            if (features[5] <= 7.887499809265137) {
                                if (features[2] <= 21.5) {
                                    classes[0] = 6;
                                    classes[1] = 11;
                                } else {
                                    if (features[5] <= 7.762499809265137) {
                                        if (features[5] <= 7.735400199890137) {
                                            classes[0] = 1;
                                            classes[1] = 6;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 7;
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 11;
                                    }
                                }
                            } else {
                                if (features[5] <= 11.402099609375) {
                                    if (features[2] <= 21.5) {
                                        classes[0] = 6;
                                        classes[1] = 4;
                                    } else {
                                        if (features[2] <= 26.0) {
                                            classes[0] = 8;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 2;
                                        }
                                    }
                                } else {
                                    if (features[6] <= 0.5) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 8;
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 20.799999237060547) {
                                classes[0] = 0;
                                classes[1] = 19;
                            } else {
                                classes[0] = 4;
                                classes[1] = 7;
                            }
                        }
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 9;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[5] <= 51.931251525878906) {
                if (features[2] <= 6.5) {
                    if (features[3] <= 2.5) {
                        classes[0] = 0;
                        classes[1] = 9;
                    } else {
                        classes[0] = 9;
                        classes[1] = 1;
                    }
                } else {
                    if (features[0] <= 1.5) {
                        if (features[5] <= 30.597900390625) {
                            if (features[5] <= 29.850000381469727) {
                                if (features[5] <= 26.143749237060547) {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 53.5) {
                                        if (features[5] <= 27.135398864746094) {
                                            classes[0] = 4;
                                            classes[1] = 8;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 2;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[2] <= 33.5) {
                                classes[0] = 6;
                                classes[1] = 1;
                            } else {
                                classes[0] = 10;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[2] <= 29.349559783935547) {
                                if (features[3] <= 0.5) {
                                    classes[0] = 4;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                }
                            } else {
                                if (features[5] <= 13.66664981842041) {
                                    if (features[5] <= 7.5625) {
                                        if (features[5] <= 7.227099895477295) {
                                            classes[0] = 6;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                }
                            }
                        } else {
                            if (features[2] <= 26.5) {
                                if (features[2] <= 20.5) {
                                    if (features[5] <= 7.910400390625) {
                                        classes[0] = 21;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 8.175000190734863) {
                                            classes[0] = 6;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 10.5) {
                                                classes[0] = 5;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 21;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[3] <= 0.5) {
                                        classes[0] = 61;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 10.081250190734863) {
                                            classes[0] = 12;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 27.5) {
                                    classes[0] = 2;
                                    classes[1] = 6;
                                } else {
                                    if (features[5] <= 7.910400390625) {
                                        if (features[5] <= 7.762499809265137) {
                                            classes[0] = 50;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 7.86460018157959) {
                                                if (features[2] <= 30.349559783935547) {
                                                    classes[0] = 4;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 8;
                                                    classes[1] = 1;
                                                }
                                            } else {
                                                classes[0] = 25;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 7.987500190734863) {
                                            classes[0] = 4;
                                            classes[1] = 6;
                                        } else {
                                            if (features[5] <= 13.25) {
                                                if (features[2] <= 46.0) {
                                                    if (features[2] <= 37.5) {
                                                        if (features[2] <= 32.5) {
                                                            if (features[2] <= 29.849559783935547) {
                                                                if (features[5] <= 8.081250190734863) {
                                                                    classes[0] = 12;
                                                                    classes[1] = 0;
                                                                } else {
                                                                    classes[0] = 7;
                                                                    classes[1] = 3;
                                                                }
                                                            } else {
                                                                classes[0] = 5;
                                                                classes[1] = 7;
                                                            }
                                                        } else {
                                                            classes[0] = 16;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 6;
                                                    }
                                                } else {
                                                    classes[0] = 13;
                                                    classes[1] = 1;
                                                }
                                            } else {
                                                if (features[5] <= 22.887500762939453) {
                                                    classes[0] = 39;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[2] <= 34.5) {
                                                        classes[0] = 4;
                                                        classes[1] = 5;
                                                    } else {
                                                        classes[0] = 21;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[5] <= 59.189598083496094) {
                    if (features[5] <= 54.270851135253906) {
                        classes[0] = 5;
                        classes[1] = 5;
                    } else {
                        classes[0] = 2;
                        classes[1] = 11;
                    }
                } else {
                    if (features[5] <= 80.754150390625) {
                        if (features[2] <= 28.0) {
                            classes[0] = 5;
                            classes[1] = 3;
                        } else {
                            classes[0] = 8;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[6] <= 1.0) {
                            classes[0] = 5;
                            classes[1] = 2;
                        } else {
                            classes[0] = 0;
                            classes[1] = 7;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_4(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[5] <= 25.964599609375) {
                        if (features[2] <= 25.5) {
                            classes[0] = 1;
                            classes[1] = 8;
                        } else {
                            classes[0] = 0;
                            classes[1] = 25;
                        }
                    } else {
                        if (features[2] <= 28.5) {
                            classes[0] = 1;
                            classes[1] = 10;
                        } else {
                            classes[0] = 1;
                            classes[1] = 7;
                        }
                    }
                } else {
                    if (features[2] <= 11.5) {
                        classes[0] = 1;
                        classes[1] = 6;
                    } else {
                        classes[0] = 0;
                        classes[1] = 115;
                    }
                }
            } else {
                if (features[5] <= 23.254150390625) {
                    if (features[2] <= 7.0) {
                        classes[0] = 0;
                        classes[1] = 13;
                    } else {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 8.083349227905273) {
                                if (features[5] <= 7.789599895477295) {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 2;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 11;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 8;
                                }
                            } else {
                                if (features[5] <= 15.372900009155273) {
                                    classes[0] = 10;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        } else {
                            if (features[5] <= 8.672900199890137) {
                                if (features[2] <= 24.0) {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[3] <= 0.5) {
                                    if (features[2] <= 28.5) {
                                        classes[0] = 1;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 8;
                                    }
                                } else {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 9;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 9;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[4] <= 3.5) {
                        classes[0] = 21;
                        classes[1] = 0;
                    } else {
                        classes[0] = 5;
                        classes[1] = 1;
                    }
                }
            }
        } else {
            if (features[5] <= 26.268749237060547) {
                if (features[2] <= 13.5) {
                    classes[0] = 1;
                    classes[1] = 10;
                } else {
                    if (features[5] <= 7.762499809265137) {
                        if (features[2] <= 29.349559783935547) {
                            if (features[2] <= 23.75) {
                                classes[0] = 15;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 7.095849990844727) {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 3;
                                }
                            }
                        } else {
                            classes[0] = 71;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[5] <= 7.8125) {
                            if (features[2] <= 25.5) {
                                classes[0] = 3;
                                classes[1] = 3;
                            } else {
                                classes[0] = 3;
                                classes[1] = 4;
                            }
                        } else {
                            if (features[6] <= 0.5) {
                                if (features[5] <= 14.852049827575684) {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 4;
                                }
                            } else {
                                if (features[2] <= 28.75) {
                                    if (features[2] <= 20.5) {
                                        if (features[5] <= 8.175000190734863) {
                                            if (features[5] <= 7.910400390625) {
                                                classes[0] = 10;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 1;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            classes[0] = 17;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 73;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[2] <= 32.5) {
                                        if (features[2] <= 31.5) {
                                            if (features[5] <= 8.081250190734863) {
                                                classes[0] = 28;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 13.75) {
                                                    classes[0] = 6;
                                                    classes[1] = 9;
                                                } else {
                                                    if (features[6] <= 1.5) {
                                                        classes[0] = 7;
                                                        classes[1] = 2;
                                                    } else {
                                                        classes[0] = 13;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[5] <= 7.987500190734863) {
                                                classes[0] = 6;
                                                classes[1] = 4;
                                            } else {
                                                classes[0] = 3;
                                                classes[1] = 3;
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 58.0) {
                                            if (features[2] <= 41.25) {
                                                classes[0] = 31;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 46.0) {
                                                    classes[0] = 13;
                                                    classes[1] = 4;
                                                } else {
                                                    classes[0] = 19;
                                                    classes[1] = 0;
                                                }
                                            }
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[3] <= 1.5) {
                    if (features[2] <= 60.5) {
                        if (features[5] <= 27.135398864746094) {
                            if (features[2] <= 39.0) {
                                classes[0] = 1;
                                classes[1] = 7;
                            } else {
                                classes[0] = 2;
                                classes[1] = 3;
                            }
                        } else {
                            if (features[2] <= 27.5) {
                                if (features[5] <= 77.00834655761719) {
                                    if (features[5] <= 39.29170227050781) {
                                        classes[0] = 0;
                                        classes[1] = 10;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 6;
                                    }
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[5] <= 52.277099609375) {
                                    if (features[5] <= 36.252098083496094) {
                                        if (features[0] <= 1.5) {
                                            if (features[2] <= 29.849559783935547) {
                                                classes[0] = 2;
                                                classes[1] = 7;
                                            } else {
                                                classes[0] = 9;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[3] <= 0.5) {
                                            classes[0] = 13;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    if (features[5] <= 59.087501525878906) {
                                        classes[0] = 4;
                                        classes[1] = 12;
                                    } else {
                                        if (features[2] <= 47.0) {
                                            classes[0] = 10;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 9;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 23;
                    classes[1] = 0;
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_5(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[3] <= 0.5) {
                    classes[0] = 0;
                    classes[1] = 71;
                } else {
                    if (features[5] <= 26.125) {
                        if (features[2] <= 29.5) {
                            classes[0] = 1;
                            classes[1] = 16;
                        } else {
                            classes[0] = 5;
                            classes[1] = 7;
                        }
                    } else {
                        if (features[5] <= 116.63749694824219) {
                            classes[0] = 0;
                            classes[1] = 60;
                        } else {
                            classes[0] = 2;
                            classes[1] = 7;
                        }
                    }
                }
            } else {
                if (features[5] <= 7.887499809265137) {
                    if (features[5] <= 7.741650104522705) {
                        if (features[5] <= 7.372900009155273) {
                            classes[0] = 2;
                            classes[1] = 8;
                        } else {
                            classes[0] = 1;
                            classes[1] = 11;
                        }
                    } else {
                        if (features[6] <= 1.5) {
                            classes[0] = 6;
                            classes[1] = 17;
                        } else {
                            classes[0] = 5;
                            classes[1] = 3;
                        }
                    }
                } else {
                    if (features[2] <= 6.5) {
                        classes[0] = 1;
                        classes[1] = 8;
                    } else {
                        if (features[4] <= 0.5) {
                            if (features[5] <= 15.0) {
                                if (features[5] <= 8.766650199890137) {
                                    classes[0] = 6;
                                    classes[1] = 3;
                                } else {
                                    if (features[5] <= 10.539600372314453) {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 2;
                                    }
                                }
                            } else {
                                classes[0] = 2;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[5] <= 23.254150390625) {
                                if (features[4] <= 1.5) {
                                    classes[0] = 13;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 22;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 6.5) {
                if (features[3] <= 1.5) {
                    classes[0] = 0;
                    classes[1] = 18;
                } else {
                    classes[0] = 4;
                    classes[1] = 3;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 60.5) {
                        if (features[5] <= 26.143749237060547) {
                            classes[0] = 9;
                            classes[1] = 0;
                        } else {
                            if (features[5] <= 27.135398864746094) {
                                classes[0] = 4;
                                classes[1] = 8;
                            } else {
                                if (features[6] <= 0.5) {
                                    if (features[5] <= 29.850000381469727) {
                                        classes[0] = 5;
                                        classes[1] = 1;
                                    } else {
                                        if (features[5] <= 77.964599609375) {
                                            if (features[5] <= 47.783348083496094) {
                                                classes[0] = 5;
                                                classes[1] = 6;
                                            } else {
                                                classes[0] = 1;
                                                classes[1] = 9;
                                            }
                                        } else {
                                            if (features[2] <= 41.0) {
                                                classes[0] = 4;
                                                classes[1] = 4;
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 2;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[3] <= 0.5) {
                                        if (features[5] <= 41.29999923706055) {
                                            classes[0] = 7;
                                            classes[1] = 5;
                                        } else {
                                            classes[0] = 16;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[2] <= 40.0) {
                                            classes[0] = 4;
                                            classes[1] = 7;
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 2;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 12;
                        classes[1] = 0;
                    }
                } else {
                    if (features[6] <= 0.5) {
                        if (features[2] <= 29.849559783935547) {
                            if (features[5] <= 9.568750381469727) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 4;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 13;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 8;
                                classes[1] = 6;
                            }
                        } else {
                            classes[0] = 12;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[5] <= 7.745850086212158) {
                            if (features[5] <= 3.1187500953674316) {
                                classes[0] = 16;
                                classes[1] = 1;
                            } else {
                                classes[0] = 48;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[5] <= 7.785400390625) {
                                if (features[2] <= 29.349559783935547) {
                                    classes[0] = 5;
                                    classes[1] = 6;
                                } else {
                                    if (features[2] <= 31.349559783935547) {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    if (features[2] <= 9.5) {
                                        classes[0] = 9;
                                        classes[1] = 3;
                                    } else {
                                        if (features[5] <= 7.910400390625) {
                                            classes[0] = 49;
                                            classes[1] = 0;
                                        } else {
                                            if (features[2] <= 26.5) {
                                                if (features[5] <= 8.175000190734863) {
                                                    if (features[2] <= 20.5) {
                                                        classes[0] = 3;
                                                        classes[1] = 3;
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    classes[0] = 60;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[5] <= 8.560400009155273) {
                                                    classes[0] = 17;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[4] <= 0.5) {
                                                        if (features[5] <= 18.033349990844727) {
                                                            if (features[5] <= 13.25) {
                                                                classes[0] = 9;
                                                                classes[1] = 3;
                                                            } else {
                                                                classes[0] = 12;
                                                                classes[1] = 0;
                                                            }
                                                        } else {
                                                            classes[0] = 3;
                                                            classes[1] = 3;
                                                        }
                                                    } else {
                                                        classes[0] = 10;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 13.25) {
                                        if (features[5] <= 8.206250190734863) {
                                            if (features[2] <= 33.0) {
                                                classes[0] = 5;
                                                classes[1] = 5;
                                            } else {
                                                if (features[2] <= 43.5) {
                                                    classes[0] = 7;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 3;
                                                    classes[1] = 3;
                                                }
                                            }
                                        } else {
                                            if (features[5] <= 9.25) {
                                                classes[0] = 11;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 35.5) {
                                                    if (features[2] <= 31.5) {
                                                        classes[0] = 4;
                                                        classes[1] = 3;
                                                    } else {
                                                        classes[0] = 9;
                                                        classes[1] = 1;
                                                    }
                                                } else {
                                                    classes[0] = 4;
                                                    classes[1] = 4;
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 33.5) {
                                            classes[0] = 5;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 33;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_6(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[5] <= 25.964599609375) {
                        if (features[2] <= 37.0) {
                            if (features[2] <= 25.5) {
                                classes[0] = 1;
                                classes[1] = 10;
                            } else {
                                classes[0] = 0;
                                classes[1] = 22;
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 11;
                        }
                    } else {
                        classes[0] = 4;
                        classes[1] = 9;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 97;
                }
            } else {
                if (features[5] <= 23.700000762939453) {
                    if (features[6] <= 1.5) {
                        if (features[5] <= 15.372900009155273) {
                            if (features[5] <= 12.847949981689453) {
                                if (features[5] <= 7.768750190734863) {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 2;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 9;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 8;
                                }
                            } else {
                                classes[0] = 5;
                                classes[1] = 2;
                            }
                        } else {
                            classes[0] = 1;
                            classes[1] = 16;
                        }
                    } else {
                        if (features[5] <= 10.824999809265137) {
                            if (features[5] <= 9.46875) {
                                if (features[2] <= 27.5) {
                                    if (features[2] <= 23.0) {
                                        classes[0] = 5;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 4;
                                    }
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 1;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 1;
                            }
                        } else {
                            if (features[5] <= 17.599998474121094) {
                                classes[0] = 1;
                                classes[1] = 13;
                            } else {
                                classes[0] = 7;
                                classes[1] = 3;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 18;
                        classes[1] = 0;
                    } else {
                        classes[0] = 5;
                        classes[1] = 2;
                    }
                }
            }
        } else {
            if (features[5] <= 13.681249618530273) {
                if (features[5] <= 7.910400390625) {
                    if (features[2] <= 27.5) {
                        if (features[2] <= 19.5) {
                            classes[0] = 25;
                            classes[1] = 0;
                        } else {
                            if (features[5] <= 7.824999809265137) {
                                if (features[5] <= 7.712500095367432) {
                                    if (features[5] <= 7.23960018157959) {
                                        classes[0] = 10;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 14;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[5] <= 7.227099895477295) {
                                classes[0] = 9;
                                classes[1] = 0;
                            } else {
                                classes[0] = 11;
                                classes[1] = 1;
                            }
                        } else {
                            classes[0] = 103;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[2] <= 19.5) {
                        if (features[5] <= 10.335399627685547) {
                            classes[0] = 10;
                            classes[1] = 6;
                        } else {
                            classes[0] = 2;
                            classes[1] = 7;
                        }
                    } else {
                        if (features[2] <= 29.349559783935547) {
                            classes[0] = 34;
                            classes[1] = 0;
                        } else {
                            if (features[5] <= 7.987500190734863) {
                                classes[0] = 4;
                                classes[1] = 3;
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    classes[0] = 15;
                                    classes[1] = 6;
                                } else {
                                    if (features[5] <= 8.206250190734863) {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    } else {
                                        if (features[2] <= 34.5) {
                                            classes[0] = 11;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 27;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[2] <= 3.5) {
                    classes[0] = 2;
                    classes[1] = 13;
                } else {
                    if (features[0] <= 1.5) {
                        if (features[2] <= 51.5) {
                            if (features[5] <= 33.0) {
                                if (features[2] <= 30.849559783935547) {
                                    if (features[5] <= 28.710399627685547) {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 7;
                                    }
                                } else {
                                    if (features[2] <= 43.5) {
                                        classes[0] = 0;
                                        classes[1] = 12;
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 3;
                                    }
                                }
                            } else {
                                if (features[4] <= 1.5) {
                                    if (features[2] <= 47.5) {
                                        if (features[2] <= 28.849559783935547) {
                                            classes[0] = 5;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 41.0) {
                                                if (features[2] <= 32.34955978393555) {
                                                    classes[0] = 14;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 4;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    }
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                }
                            }
                        } else {
                            if (features[2] <= 61.5) {
                                if (features[5] <= 31.50830078125) {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                }
                            } else {
                                classes[0] = 5;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[5] <= 20.233348846435547) {
                                classes[0] = 6;
                                classes[1] = 13;
                            } else {
                                classes[0] = 11;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[2] <= 10.0) {
                                classes[0] = 13;
                                classes[1] = 7;
                            } else {
                                if (features[5] <= 51.697898864746094) {
                                    if (features[0] <= 2.5) {
                                        if (features[2] <= 33.0) {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 14;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 45;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_7(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 22.0) {
                    if (features[5] <= 17.375) {
                        if (features[2] <= 37.0) {
                            classes[0] = 0;
                            classes[1] = 19;
                        } else {
                            classes[0] = 2;
                            classes[1] = 5;
                        }
                    } else {
                        classes[0] = 3;
                        classes[1] = 4;
                    }
                } else {
                    if (features[5] <= 149.035400390625) {
                        if (features[2] <= 49.0) {
                            classes[0] = 0;
                            classes[1] = 99;
                        } else {
                            if (features[5] <= 78.11250305175781) {
                                classes[0] = 1;
                                classes[1] = 7;
                            } else {
                                classes[0] = 0;
                                classes[1] = 9;
                            }
                        }
                    } else {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 13;
                        } else {
                            classes[0] = 2;
                            classes[1] = 5;
                        }
                    }
                }
            } else {
                if (features[6] <= 1.5) {
                    if (features[5] <= 15.372900009155273) {
                        if (features[5] <= 13.935449600219727) {
                            if (features[5] <= 7.681250095367432) {
                                classes[0] = 4;
                                classes[1] = 6;
                            } else {
                                classes[0] = 5;
                                classes[1] = 19;
                            }
                        } else {
                            classes[0] = 8;
                            classes[1] = 3;
                        }
                    } else {
                        classes[0] = 1;
                        classes[1] = 16;
                    }
                } else {
                    if (features[5] <= 17.350000381469727) {
                        if (features[5] <= 10.824999809265137) {
                            if (features[5] <= 7.987500190734863) {
                                if (features[2] <= 21.5) {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 9.831249237060547) {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 1;
                                }
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 15;
                        }
                    } else {
                        if (features[2] <= 30.5) {
                            if (features[2] <= 5.5) {
                                classes[0] = 5;
                                classes[1] = 3;
                            } else {
                                classes[0] = 26;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 10;
                            classes[1] = 8;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 3.0) {
                    classes[0] = 0;
                    classes[1] = 31;
                } else {
                    classes[0] = 13;
                    classes[1] = 0;
                }
            } else {
                if (features[5] <= 26.143749237060547) {
                    if (features[6] <= 0.5) {
                        if (features[2] <= 29.849559783935547) {
                            if (features[5] <= 7.5625) {
                                if (features[2] <= 29.099559783935547) {
                                    classes[0] = 9;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 14.456249237060547) {
                                    classes[0] = 6;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                }
                            }
                        } else {
                            classes[0] = 12;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[5] <= 11.0) {
                            if (features[5] <= 7.762499809265137) {
                                if (features[2] <= 29.349559783935547) {
                                    if (features[2] <= 23.0) {
                                        classes[0] = 13;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 7.195849895477295) {
                                            classes[0] = 6;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    classes[0] = 51;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 7.797900199890137) {
                                    if (features[5] <= 7.785400390625) {
                                        classes[0] = 8;
                                        classes[1] = 4;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 4;
                                    }
                                } else {
                                    if (features[2] <= 31.5) {
                                        if (features[2] <= 19.5) {
                                            if (features[5] <= 8.104150772094727) {
                                                classes[0] = 7;
                                                classes[1] = 6;
                                            } else {
                                                classes[0] = 8;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            if (features[2] <= 29.849559783935547) {
                                                if (features[2] <= 20.5) {
                                                    classes[0] = 7;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 77;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 32.5) {
                                            classes[0] = 2;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 43.0) {
                                                classes[0] = 11;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 13.25) {
                                if (features[2] <= 30.5) {
                                    classes[0] = 17;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 45.0) {
                                        classes[0] = 4;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 57;
                                classes[1] = 0;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 51.5) {
                        if (features[5] <= 26.774999618530273) {
                            classes[0] = 3;
                            classes[1] = 10;
                        } else {
                            if (features[5] <= 52.277099609375) {
                                if (features[2] <= 28.5) {
                                    classes[0] = 3;
                                    classes[1] = 3;
                                } else {
                                    if (features[2] <= 29.849559783935547) {
                                        if (features[5] <= 30.597900390625) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 18;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[5] <= 64.9791488647461) {
                                    if (features[2] <= 28.849559783935547) {
                                        classes[0] = 2;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 8;
                                    }
                                } else {
                                    if (features[5] <= 86.28959655761719) {
                                        if (features[5] <= 75.1146011352539) {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        if (features[2] <= 30.0) {
                                            classes[0] = 7;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 2;
                                            classes[1] = 7;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 61.5) {
                            classes[0] = 15;
                            classes[1] = 0;
                        } else {
                            classes[0] = 6;
                            classes[1] = 1;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_8(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 149.035400390625) {
                    if (features[5] <= 13.39585018157959) {
                        if (features[2] <= 28.0) {
                            classes[0] = 1;
                            classes[1] = 6;
                        } else {
                            classes[0] = 0;
                            classes[1] = 18;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 121;
                    }
                } else {
                    if (features[5] <= 188.1020965576172) {
                        classes[0] = 3;
                        classes[1] = 4;
                    } else {
                        classes[0] = 0;
                        classes[1] = 18;
                    }
                }
            } else {
                if (features[6] <= 1.5) {
                    if (features[5] <= 8.083349227905273) {
                        classes[0] = 2;
                        classes[1] = 19;
                    } else {
                        if (features[5] <= 15.372900009155273) {
                            if (features[2] <= 16.5) {
                                classes[0] = 2;
                                classes[1] = 8;
                            } else {
                                classes[0] = 10;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[4] <= 0.5) {
                                classes[0] = 0;
                                classes[1] = 9;
                            } else {
                                classes[0] = 3;
                                classes[1] = 7;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 17.599998474121094) {
                        if (features[5] <= 10.824999809265137) {
                            if (features[5] <= 9.706249237060547) {
                                if (features[2] <= 28.349559783935547) {
                                    if (features[2] <= 22.5) {
                                        classes[0] = 3;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 6;
                                    }
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 4;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 1;
                            }
                        } else {
                            classes[0] = 3;
                            classes[1] = 8;
                        }
                    } else {
                        if (features[2] <= 10.0) {
                            classes[0] = 6;
                            classes[1] = 2;
                        } else {
                            if (features[5] <= 24.808349609375) {
                                classes[0] = 5;
                                classes[1] = 1;
                            } else {
                                classes[0] = 15;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        } else {
            if (features[5] <= 15.172900199890137) {
                if (features[2] <= 16.5) {
                    classes[0] = 3;
                    classes[1] = 3;
                } else {
                    if (features[2] <= 60.5) {
                        if (features[5] <= 7.745850086212158) {
                            if (features[2] <= 27.75) {
                                if (features[5] <= 7.227099895477295) {
                                    if (features[2] <= 21.0) {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 13;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 58;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[5] <= 7.987500190734863) {
                                if (features[2] <= 28.5) {
                                    if (features[5] <= 7.824999809265137) {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    } else {
                                        if (features[2] <= 20.5) {
                                            classes[0] = 8;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 25;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    if (features[2] <= 32.5) {
                                        if (features[2] <= 30.349559783935547) {
                                            if (features[6] <= 1.5) {
                                                classes[0] = 10;
                                                classes[1] = 8;
                                            } else {
                                                classes[0] = 17;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 6;
                                        }
                                    } else {
                                        if (features[2] <= 37.5) {
                                            classes[0] = 7;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 1;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 19.5) {
                                    if (features[2] <= 18.5) {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 3;
                                    }
                                } else {
                                    if (features[2] <= 30.5) {
                                        if (features[6] <= 1.0) {
                                            classes[0] = 13;
                                            classes[1] = 1;
                                        } else {
                                            if (features[2] <= 27.5) {
                                                if (features[2] <= 25.5) {
                                                    classes[0] = 29;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 1;
                                                }
                                            } else {
                                                classes[0] = 38;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 34.5) {
                                            if (features[5] <= 11.387499809265137) {
                                                classes[0] = 11;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 3;
                                            }
                                        } else {
                                            classes[0] = 22;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 6;
                        classes[1] = 3;
                    }
                }
            } else {
                if (features[2] <= 1.5) {
                    classes[0] = 0;
                    classes[1] = 6;
                } else {
                    if (features[0] <= 1.5) {
                        if (features[2] <= 52.5) {
                            if (features[2] <= 30.5) {
                                if (features[5] <= 28.725000381469727) {
                                    classes[0] = 11;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 35.14789962768555) {
                                        classes[0] = 1;
                                        classes[1] = 9;
                                    } else {
                                        if (features[2] <= 27.5) {
                                            if (features[5] <= 77.00834655761719) {
                                                classes[0] = 2;
                                                classes[1] = 8;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 11;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 36.5) {
                                    classes[0] = 1;
                                    classes[1] = 13;
                                } else {
                                    if (features[5] <= 52.82709884643555) {
                                        if (features[2] <= 45.25) {
                                            classes[0] = 1;
                                            classes[1] = 7;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 3;
                                        }
                                    } else {
                                        if (features[5] <= 86.28959655761719) {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 6;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 43.25835037231445) {
                                classes[0] = 7;
                                classes[1] = 1;
                            } else {
                                classes[0] = 8;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            classes[0] = 3;
                            classes[1] = 8;
                        } else {
                            if (features[2] <= 10.0) {
                                if (features[5] <= 28.512500762939453) {
                                    classes[0] = 2;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 51.697898864746094) {
                                    if (features[6] <= 1.5) {
                                        classes[0] = 7;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 50;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_9(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 27.5) {
                    if (features[2] <= 24.5) {
                        if (features[2] <= 23.5) {
                            if (features[5] <= 135.77499389648438) {
                                classes[0] = 0;
                                classes[1] = 38;
                            } else {
                                classes[0] = 1;
                                classes[1] = 7;
                            }
                        } else {
                            classes[0] = 1;
                            classes[1] = 5;
                        }
                    } else {
                        classes[0] = 6;
                        classes[1] = 7;
                    }
                } else {
                    if (features[5] <= 26.125) {
                        if (features[2] <= 37.0) {
                            classes[0] = 0;
                            classes[1] = 26;
                        } else {
                            if (features[2] <= 44.5) {
                                classes[0] = 2;
                                classes[1] = 5;
                            } else {
                                classes[0] = 0;
                                classes[1] = 9;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 76;
                    }
                }
            } else {
                if (features[5] <= 8.039600372314453) {
                    if (features[5] <= 7.762499809265137) {
                        if (features[5] <= 7.743750095367432) {
                            classes[0] = 0;
                            classes[1] = 8;
                        } else {
                            classes[0] = 5;
                            classes[1] = 7;
                        }
                    } else {
                        classes[0] = 1;
                        classes[1] = 15;
                    }
                } else {
                    if (features[2] <= 5.5) {
                        classes[0] = 1;
                        classes[1] = 10;
                    } else {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 15.372900009155273) {
                                classes[0] = 7;
                                classes[1] = 4;
                            } else {
                                classes[0] = 2;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[5] <= 20.799999237060547) {
                                if (features[5] <= 9.839599609375) {
                                    classes[0] = 13;
                                    classes[1] = 1;
                                } else {
                                    if (features[4] <= 0.5) {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 3;
                                    }
                                }
                            } else {
                                classes[0] = 22;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 10.0) {
                if (features[3] <= 2.5) {
                    classes[0] = 0;
                    classes[1] = 23;
                } else {
                    classes[0] = 13;
                    classes[1] = 1;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 43.5) {
                        if (features[2] <= 33.5) {
                            if (features[5] <= 30.75) {
                                if (features[5] <= 28.725000381469727) {
                                    classes[0] = 9;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 5;
                                }
                            } else {
                                if (features[5] <= 52.54999923706055) {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 4;
                                }
                            }
                        } else {
                            if (features[2] <= 36.5) {
                                classes[0] = 0;
                                classes[1] = 12;
                            } else {
                                classes[0] = 8;
                                classes[1] = 5;
                            }
                        }
                    } else {
                        if (features[2] <= 57.0) {
                            if (features[2] <= 47.5) {
                                classes[0] = 10;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 45.70000076293945) {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                }
                            }
                        } else {
                            classes[0] = 14;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[5] <= 2.0062499046325684) {
                        classes[0] = 7;
                        classes[1] = 4;
                    } else {
                        if (features[2] <= 45.25) {
                            if (features[2] <= 43.5) {
                                if (features[5] <= 23.350000381469727) {
                                    if (features[3] <= 0.5) {
                                        if (features[2] <= 29.349559783935547) {
                                            if (features[2] <= 28.5) {
                                                if (features[5] <= 7.227099895477295) {
                                                    classes[0] = 5;
                                                    classes[1] = 4;
                                                } else {
                                                    if (features[2] <= 25.5) {
                                                        if (features[2] <= 19.5) {
                                                            if (features[5] <= 7.972900390625) {
                                                                classes[0] = 10;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[5] <= 11.0) {
                                                                    classes[0] = 9;
                                                                    classes[1] = 5;
                                                                } else {
                                                                    classes[0] = 7;
                                                                    classes[1] = 0;
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 54;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        if (features[5] <= 8.279150009155273) {
                                                            classes[0] = 5;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 5;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            if (features[2] <= 30.75) {
                                                if (features[5] <= 7.80210018157959) {
                                                    if (features[5] <= 7.743750095367432) {
                                                        if (features[5] <= 7.227099895477295) {
                                                            classes[0] = 17;
                                                            classes[1] = 0;
                                                        } else {
                                                            if (features[5] <= 7.23960018157959) {
                                                                classes[0] = 7;
                                                                classes[1] = 1;
                                                            } else {
                                                                classes[0] = 10;
                                                                classes[1] = 0;
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 12;
                                                        classes[1] = 2;
                                                    }
                                                } else {
                                                    classes[0] = 45;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[5] <= 7.910400390625) {
                                                    classes[0] = 25;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 7.987500190734863) {
                                                        classes[0] = 4;
                                                        classes[1] = 6;
                                                    } else {
                                                        if (features[5] <= 12.637499809265137) {
                                                            classes[0] = 20;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 5;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[6] <= 0.5) {
                                            classes[0] = 3;
                                            classes[1] = 5;
                                        } else {
                                            if (features[2] <= 25.5) {
                                                classes[0] = 9;
                                                classes[1] = 4;
                                            } else {
                                                if (features[5] <= 20.549999237060547) {
                                                    classes[0] = 19;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[2] <= 30.849559783935547) {
                                        if (features[5] <= 51.697898864746094) {
                                            classes[0] = 35;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 15;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        if (features[5] <= 26.5) {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 1;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 5;
                                classes[1] = 3;
                            }
                        } else {
                            classes[0] = 38;
                            classes[1] = 0;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_10(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 13.25) {
                    if (features[5] <= 12.824999809265137) {
                        classes[0] = 0;
                        classes[1] = 6;
                    } else {
                        classes[0] = 3;
                        classes[1] = 8;
                    }
                } else {
                    if (features[5] <= 22.0) {
                        classes[0] = 1;
                        classes[1] = 12;
                    } else {
                        classes[0] = 0;
                        classes[1] = 121;
                    }
                }
            } else {
                if (features[5] <= 24.358348846435547) {
                    if (features[5] <= 7.841699600219727) {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 7.735400199890137) {
                                classes[0] = 3;
                                classes[1] = 6;
                            } else {
                                classes[0] = 1;
                                classes[1] = 19;
                            }
                        } else {
                            classes[0] = 5;
                            classes[1] = 6;
                        }
                    } else {
                        if (features[5] <= 15.372900009155273) {
                            if (features[2] <= 19.5) {
                                if (features[5] <= 12.945850372314453) {
                                    classes[0] = 3;
                                    classes[1] = 13;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 7.987500190734863) {
                                    classes[0] = 4;
                                    classes[1] = 6;
                                } else {
                                    if (features[4] <= 0.5) {
                                        classes[0] = 14;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 4;
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 29.349559783935547) {
                                classes[0] = 5;
                                classes[1] = 5;
                            } else {
                                if (features[2] <= 31.5) {
                                    classes[0] = 0;
                                    classes[1] = 11;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 4;
                                }
                            }
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 16;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 37.03125) {
                            classes[0] = 4;
                            classes[1] = 4;
                        } else {
                            classes[0] = 10;
                            classes[1] = 0;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 9.5) {
                if (features[3] <= 2.0) {
                    classes[0] = 0;
                    classes[1] = 28;
                } else {
                    classes[0] = 13;
                    classes[1] = 0;
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[6] <= 0.5) {
                        if (features[5] <= 13.368749618530273) {
                            if (features[2] <= 29.849559783935547) {
                                if (features[5] <= 7.227099895477295) {
                                    classes[0] = 6;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 13;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 11;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[2] <= 28.349559783935547) {
                                classes[0] = 5;
                                classes[1] = 2;
                            } else {
                                classes[0] = 4;
                                classes[1] = 8;
                            }
                        }
                    } else {
                        if (features[5] <= 13.5) {
                            if (features[3] <= 0.5) {
                                if (features[5] <= 7.910400390625) {
                                    if (features[2] <= 25.5) {
                                        if (features[5] <= 7.195849895477295) {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        } else {
                                            if (features[2] <= 21.5) {
                                                classes[0] = 9;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 14;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 7.741650104522705) {
                                            classes[0] = 41;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 7.86460018157959) {
                                                if (features[6] <= 1.5) {
                                                    classes[0] = 13;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 10;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                classes[0] = 26;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[2] <= 26.5) {
                                        if (features[2] <= 18.5) {
                                            classes[0] = 11;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 36;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[2] <= 46.0) {
                                            if (features[2] <= 42.5) {
                                                if (features[5] <= 8.658349990844727) {
                                                    if (features[2] <= 31.0) {
                                                        classes[0] = 16;
                                                        classes[1] = 1;
                                                    } else {
                                                        if (features[2] <= 33.5) {
                                                            classes[0] = 6;
                                                            classes[1] = 2;
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 1;
                                                        }
                                                    }
                                                } else {
                                                    if (features[2] <= 29.849559783935547) {
                                                        classes[0] = 8;
                                                        classes[1] = 5;
                                                    } else {
                                                        if (features[2] <= 33.5) {
                                                            classes[0] = 7;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 8;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 24.0) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 5;
                                }
                            }
                        } else {
                            if (features[6] <= 1.5) {
                                classes[0] = 7;
                                classes[1] = 2;
                            } else {
                                if (features[5] <= 25.962499618530273) {
                                    classes[0] = 52;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 34.5) {
                                        classes[0] = 9;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[3] <= 0.5) {
                        if (features[2] <= 43.5) {
                            if (features[5] <= 32.75) {
                                if (features[6] <= 1.0) {
                                    classes[0] = 4;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 9;
                                }
                            } else {
                                if (features[5] <= 53.49580001831055) {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 68.42915344238281) {
                                        classes[0] = 2;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 31.410400390625) {
                                if (features[2] <= 53.5) {
                                    classes[0] = 3;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[6] <= 1.0) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 12;
                                    classes[1] = 0;
                                }
                            }
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            classes[0] = 6;
                            classes[1] = 4;
                        } else {
                            if (features[5] <= 81.5625) {
                                if (features[2] <= 44.0) {
                                    classes[0] = 24;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                }
                            } else {
                                classes[0] = 4;
                                classes[1] = 1;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_11(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 149.035400390625) {
                    if (features[5] <= 28.856250762939453) {
                        if (features[2] <= 43.0) {
                            if (features[2] <= 27.5) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 0;
                                    classes[1] = 11;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 5;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 24;
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 9;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 81;
                    }
                } else {
                    if (features[5] <= 159.1645965576172) {
                        classes[0] = 3;
                        classes[1] = 3;
                    } else {
                        classes[0] = 0;
                        classes[1] = 8;
                    }
                }
            } else {
                if (features[5] <= 22.904150009155273) {
                    if (features[2] <= 30.25) {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 15.372900009155273) {
                                if (features[4] <= 0.5) {
                                    if (features[5] <= 7.683350086212158) {
                                        classes[0] = 5;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 11;
                                    }
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 11;
                            }
                        } else {
                            if (features[5] <= 17.25) {
                                if (features[5] <= 10.824999809265137) {
                                    if (features[5] <= 7.987500190734863) {
                                        if (features[2] <= 21.5) {
                                            classes[0] = 3;
                                            classes[1] = 5;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 3;
                                        }
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 8;
                                }
                            } else {
                                classes[0] = 8;
                                classes[1] = 1;
                            }
                        }
                    } else {
                        if (features[2] <= 34.0) {
                            classes[0] = 9;
                            classes[1] = 1;
                        } else {
                            classes[0] = 4;
                            classes[1] = 2;
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 15;
                        classes[1] = 0;
                    } else {
                        classes[0] = 9;
                        classes[1] = 2;
                    }
                }
            }
        } else {
            if (features[5] <= 15.172900199890137) {
                if (features[2] <= 16.5) {
                    if (features[5] <= 9.358349800109863) {
                        classes[0] = 5;
                        classes[1] = 2;
                    } else {
                        classes[0] = 3;
                        classes[1] = 5;
                    }
                } else {
                    if (features[5] <= 7.910400390625) {
                        if (features[6] <= 1.5) {
                            if (features[2] <= 29.349559783935547) {
                                if (features[2] <= 24.25) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                }
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 14;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 15;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 14;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[2] <= 25.5) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 36;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 4;
                                }
                            } else {
                                classes[0] = 85;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[5] <= 7.987500190734863) {
                            if (features[2] <= 29.5) {
                                classes[0] = 4;
                                classes[1] = 1;
                            } else {
                                classes[0] = 3;
                                classes[1] = 6;
                            }
                        } else {
                            if (features[2] <= 19.5) {
                                if (features[5] <= 9.416650772094727) {
                                    classes[0] = 6;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[5] <= 9.362500190734863) {
                                    if (features[2] <= 40.0) {
                                        classes[0] = 43;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    }
                                } else {
                                    if (features[5] <= 13.931249618530273) {
                                        if (features[2] <= 28.5) {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        } else {
                                            if (features[2] <= 29.849559783935547) {
                                                classes[0] = 3;
                                                classes[1] = 3;
                                            } else {
                                                if (features[2] <= 31.5) {
                                                    classes[0] = 10;
                                                    classes[1] = 4;
                                                } else {
                                                    if (features[2] <= 40.5) {
                                                        classes[0] = 12;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 11;
                                                        classes[1] = 3;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 20;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[2] <= 3.5) {
                    if (features[3] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 9;
                    } else {
                        classes[0] = 5;
                        classes[1] = 2;
                    }
                } else {
                    if (features[5] <= 52.277099609375) {
                        if (features[5] <= 36.877098083496094) {
                            if (features[0] <= 1.5) {
                                if (features[5] <= 27.135398864746094) {
                                    if (features[5] <= 26.337501525878906) {
                                        classes[0] = 7;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 12;
                                    }
                                } else {
                                    if (features[5] <= 29.850000381469727) {
                                        classes[0] = 15;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 30.597900390625) {
                                            classes[0] = 2;
                                            classes[1] = 6;
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 4;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 32.25) {
                                    if (features[2] <= 29.349559783935547) {
                                        if (features[2] <= 9.5) {
                                            classes[0] = 9;
                                            classes[1] = 5;
                                        } else {
                                            classes[0] = 19;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[5] <= 22.464599609375) {
                                            classes[0] = 11;
                                            classes[1] = 4;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 7;
                                        }
                                    }
                                } else {
                                    classes[0] = 26;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            classes[0] = 24;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[5] <= 59.087501525878906) {
                            classes[0] = 0;
                            classes[1] = 12;
                        } else {
                            if (features[6] <= 1.0) {
                                if (features[5] <= 112.07914733886719) {
                                    classes[0] = 2;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 86.73750305175781) {
                                    classes[0] = 17;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 4;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_12(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 28.856250762939453) {
                    if (features[2] <= 43.0) {
                        if (features[2] <= 27.5) {
                            if (features[2] <= 24.5) {
                                if (features[5] <= 13.75) {
                                    classes[0] = 2;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 13;
                                }
                            } else {
                                classes[0] = 3;
                                classes[1] = 3;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 24;
                        }
                    } else {
                        classes[0] = 6;
                        classes[1] = 7;
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 94;
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[5] <= 7.887499809265137) {
                        if (features[6] <= 1.5) {
                            if (features[2] <= 25.849559783935547) {
                                classes[0] = 2;
                                classes[1] = 6;
                            } else {
                                classes[0] = 1;
                                classes[1] = 13;
                            }
                        } else {
                            if (features[2] <= 22.5) {
                                classes[0] = 1;
                                classes[1] = 7;
                            } else {
                                classes[0] = 3;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        if (features[5] <= 15.372900009155273) {
                            if (features[2] <= 19.0) {
                                if (features[5] <= 13.464599609375) {
                                    classes[0] = 0;
                                    classes[1] = 11;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[3] <= 0.5) {
                                    if (features[5] <= 9.125) {
                                        classes[0] = 9;
                                        classes[1] = 4;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    }
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[2] <= 27.849559783935547) {
                                classes[0] = 8;
                                classes[1] = 6;
                            } else {
                                if (features[2] <= 30.349559783935547) {
                                    classes[0] = 0;
                                    classes[1] = 10;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 5;
                                }
                            }
                        }
                    }
                } else {
                    if (features[3] <= 1.5) {
                        classes[0] = 10;
                        classes[1] = 2;
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    if (features[2] <= 8.5) {
                        classes[0] = 0;
                        classes[1] = 20;
                    } else {
                        classes[0] = 3;
                        classes[1] = 5;
                    }
                } else {
                    if (features[2] <= 3.5) {
                        classes[0] = 6;
                        classes[1] = 2;
                    } else {
                        classes[0] = 10;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[6] <= 0.5) {
                        if (features[2] <= 29.349559783935547) {
                            classes[0] = 8;
                            classes[1] = 7;
                        } else {
                            if (features[5] <= 8.279150009155273) {
                                classes[0] = 11;
                                classes[1] = 0;
                            } else {
                                classes[0] = 6;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        if (features[2] <= 24.5) {
                            if (features[2] <= 19.5) {
                                if (features[2] <= 18.5) {
                                    if (features[5] <= 8.175000190734863) {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 17;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[5] <= 7.972900390625) {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 3;
                                    }
                                }
                            } else {
                                classes[0] = 61;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[2] <= 27.5) {
                                if (features[5] <= 9.581250190734863) {
                                    if (features[2] <= 25.5) {
                                        classes[0] = 3;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 5;
                                    }
                                } else {
                                    classes[0] = 13;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 7.910400390625) {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 40;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 7.86460018157959) {
                                            if (features[2] <= 30.349559783935547) {
                                                if (features[5] <= 7.762499809265137) {
                                                    classes[0] = 11;
                                                    classes[1] = 2;
                                                } else {
                                                    classes[0] = 7;
                                                    classes[1] = 1;
                                                }
                                            } else {
                                                classes[0] = 9;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 33;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    if (features[5] <= 7.987500190734863) {
                                        classes[0] = 6;
                                        classes[1] = 5;
                                    } else {
                                        if (features[5] <= 13.25) {
                                            if (features[5] <= 8.081250190734863) {
                                                classes[0] = 23;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 29.349559783935547) {
                                                    classes[0] = 10;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[2] <= 31.5) {
                                                        classes[0] = 10;
                                                        classes[1] = 7;
                                                    } else {
                                                        if (features[2] <= 40.5) {
                                                            if (features[5] <= 12.637499809265137) {
                                                                classes[0] = 8;
                                                                classes[1] = 0;
                                                            } else {
                                                                classes[0] = 6;
                                                                classes[1] = 1;
                                                            }
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 29.849559783935547) {
                                                if (features[3] <= 0.5) {
                                                    classes[0] = 12;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                classes[0] = 36;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 57.0) {
                        if (features[4] <= 0.5) {
                            if (features[2] <= 24.5) {
                                classes[0] = 10;
                                classes[1] = 0;
                            } else {
                                if (features[2] <= 27.5) {
                                    classes[0] = 0;
                                    classes[1] = 6;
                                } else {
                                    if (features[2] <= 47.0) {
                                        if (features[5] <= 26.774999618530273) {
                                            classes[0] = 2;
                                            classes[1] = 6;
                                        } else {
                                            if (features[5] <= 29.100000381469727) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 37.54999923706055) {
                                                    if (features[5] <= 30.75) {
                                                        classes[0] = 3;
                                                        classes[1] = 5;
                                                    } else {
                                                        classes[0] = 2;
                                                        classes[1] = 4;
                                                    }
                                                } else {
                                                    if (features[0] <= 2.5) {
                                                        if (features[5] <= 52.277099609375) {
                                                            classes[0] = 11;
                                                            classes[1] = 0;
                                                        } else {
                                                            if (features[5] <= 76.17500305175781) {
                                                                classes[0] = 3;
                                                                classes[1] = 2;
                                                            } else {
                                                                classes[0] = 8;
                                                                classes[1] = 1;
                                                            }
                                                        }
                                                    } else {
                                                        classes[0] = 4;
                                                        classes[1] = 6;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 7;
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 115.441650390625) {
                                if (features[2] <= 27.349559783935547) {
                                    classes[0] = 6;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 18;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 5;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        classes[0] = 18;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_13(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 13.25) {
                    if (features[2] <= 33.25) {
                        if (features[2] <= 27.5) {
                            classes[0] = 2;
                            classes[1] = 5;
                        } else {
                            classes[0] = 0;
                            classes[1] = 14;
                        }
                    } else {
                        classes[0] = 4;
                        classes[1] = 5;
                    }
                } else {
                    if (features[2] <= 5.5) {
                        classes[0] = 1;
                        classes[1] = 7;
                    } else {
                        if (features[5] <= 28.856250762939453) {
                            if (features[5] <= 25.964599609375) {
                                classes[0] = 0;
                                classes[1] = 23;
                            } else {
                                if (features[2] <= 32.0) {
                                    classes[0] = 1;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 110;
                        }
                    }
                }
            } else {
                if (features[5] <= 8.039600372314453) {
                    if (features[2] <= 17.5) {
                        classes[0] = 0;
                        classes[1] = 11;
                    } else {
                        if (features[2] <= 25.5) {
                            if (features[5] <= 7.712500095367432) {
                                classes[0] = 1;
                                classes[1] = 6;
                            } else {
                                classes[0] = 3;
                                classes[1] = 4;
                            }
                        } else {
                            if (features[5] <= 7.820849895477295) {
                                classes[0] = 2;
                                classes[1] = 18;
                            } else {
                                classes[0] = 1;
                                classes[1] = 6;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 23.700000762939453) {
                        if (features[5] <= 15.372900009155273) {
                            if (features[2] <= 19.5) {
                                classes[0] = 4;
                                classes[1] = 7;
                            } else {
                                if (features[5] <= 9.649999618530273) {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[6] <= 1.5) {
                                classes[0] = 1;
                                classes[1] = 12;
                            } else {
                                if (features[2] <= 29.349559783935547) {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 31.331249237060547) {
                            if (features[3] <= 2.0) {
                                classes[0] = 7;
                                classes[1] = 1;
                            } else {
                                classes[0] = 13;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 9;
                            classes[1] = 4;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 6.5) {
                if (features[3] <= 1.5) {
                    classes[0] = 0;
                    classes[1] = 16;
                } else {
                    classes[0] = 4;
                    classes[1] = 6;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 8;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 37.0) {
                            if (features[5] <= 29.850000381469727) {
                                if (features[5] <= 27.135398864746094) {
                                    if (features[2] <= 43.5) {
                                        classes[0] = 2;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 5;
                                    }
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 30.597900390625) {
                                    classes[0] = 1;
                                    classes[1] = 10;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 7;
                                }
                            }
                        } else {
                            if (features[6] <= 1.0) {
                                if (features[2] <= 31.5) {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                } else {
                                    if (features[3] <= 0.5) {
                                        classes[0] = 5;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 7;
                                    }
                                }
                            } else {
                                if (features[3] <= 0.5) {
                                    classes[0] = 17;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 59.849998474121094) {
                                        classes[0] = 3;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 13.0) {
                        classes[0] = 8;
                        classes[1] = 6;
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[2] <= 29.349559783935547) {
                                if (features[3] <= 0.5) {
                                    classes[0] = 7;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    if (features[5] <= 7.5625) {
                                        classes[0] = 11;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[5] <= 3.1187500953674316) {
                                classes[0] = 6;
                                classes[1] = 3;
                            } else {
                                if (features[5] <= 51.697898864746094) {
                                    if (features[2] <= 18.5) {
                                        classes[0] = 36;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 19.5) {
                                            classes[0] = 6;
                                            classes[1] = 2;
                                        } else {
                                            if (features[5] <= 25.733348846435547) {
                                                if (features[5] <= 13.25) {
                                                    if (features[5] <= 8.658349990844727) {
                                                        if (features[5] <= 7.987500190734863) {
                                                            if (features[5] <= 7.910400390625) {
                                                                if (features[5] <= 7.875) {
                                                                    if (features[5] <= 7.762499809265137) {
                                                                        if (features[2] <= 30.349559783935547) {
                                                                            if (features[2] <= 26.0) {
                                                                                classes[0] = 14;
                                                                                classes[1] = 0;
                                                                            } else {
                                                                                if (features[5] <= 7.743750095367432) {
                                                                                    classes[0] = 10;
                                                                                    classes[1] = 1;
                                                                                } else {
                                                                                    classes[0] = 5;
                                                                                    classes[1] = 1;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            classes[0] = 20;
                                                                            classes[1] = 0;
                                                                        }
                                                                    } else {
                                                                        if (features[2] <= 29.349559783935547) {
                                                                            if (features[2] <= 21.5) {
                                                                                classes[0] = 5;
                                                                                classes[1] = 1;
                                                                            } else {
                                                                                classes[0] = 9;
                                                                                classes[1] = 1;
                                                                            }
                                                                        } else {
                                                                            classes[0] = 5;
                                                                            classes[1] = 2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    classes[0] = 33;
                                                                    classes[1] = 0;
                                                                }
                                                            } else {
                                                                classes[0] = 4;
                                                                classes[1] = 3;
                                                            }
                                                        } else {
                                                            classes[0] = 46;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        if (features[5] <= 9.362500190734863) {
                                                            classes[0] = 4;
                                                            classes[1] = 3;
                                                        } else {
                                                            if (features[2] <= 28.5) {
                                                                classes[0] = 19;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[2] <= 32.0) {
                                                                    classes[0] = 6;
                                                                    classes[1] = 3;
                                                                } else {
                                                                    if (features[2] <= 43.5) {
                                                                        classes[0] = 13;
                                                                        classes[1] = 0;
                                                                    } else {
                                                                        classes[0] = 5;
                                                                        classes[1] = 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 48;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[2] <= 39.5) {
                                                    classes[0] = 10;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 63.02290344238281) {
                                        classes[0] = 5;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 13;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_14(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 28.856250762939453) {
                    if (features[5] <= 25.0) {
                        if (features[5] <= 11.425000190734863) {
                            classes[0] = 1;
                            classes[1] = 6;
                        } else {
                            classes[0] = 0;
                            classes[1] = 33;
                        }
                    } else {
                        if (features[3] <= 0.5) {
                            classes[0] = 1;
                            classes[1] = 9;
                        } else {
                            classes[0] = 4;
                            classes[1] = 10;
                        }
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 90;
                    } else {
                        if (features[2] <= 23.5) {
                            classes[0] = 0;
                            classes[1] = 8;
                        } else {
                            classes[0] = 2;
                            classes[1] = 6;
                        }
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[6] <= 1.5) {
                        if (features[5] <= 15.620849609375) {
                            if (features[4] <= 0.5) {
                                if (features[5] <= 7.681250095367432) {
                                    classes[0] = 3;
                                    classes[1] = 6;
                                } else {
                                    if (features[2] <= 25.849559783935547) {
                                        classes[0] = 1;
                                        classes[1] = 15;
                                    } else {
                                        if (features[5] <= 7.768750190734863) {
                                            classes[0] = 2;
                                            classes[1] = 7;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 4;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 10;
                                classes[1] = 4;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 12;
                        }
                    } else {
                        if (features[3] <= 0.5) {
                            if (features[5] <= 9.125) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 5;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 3;
                                classes[1] = 11;
                            }
                        } else {
                            if (features[2] <= 28.5) {
                                classes[0] = 10;
                                classes[1] = 1;
                            } else {
                                classes[0] = 5;
                                classes[1] = 3;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 10.0) {
                        classes[0] = 6;
                        classes[1] = 1;
                    } else {
                        classes[0] = 20;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    if (features[2] <= 8.5) {
                        classes[0] = 0;
                        classes[1] = 16;
                    } else {
                        classes[0] = 1;
                        classes[1] = 6;
                    }
                } else {
                    if (features[2] <= 3.5) {
                        classes[0] = 6;
                        classes[1] = 1;
                    } else {
                        classes[0] = 8;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 57.0) {
                        if (features[5] <= 30.597900390625) {
                            if (features[5] <= 26.143749237060547) {
                                classes[0] = 8;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 27.135398864746094) {
                                    classes[0] = 1;
                                    classes[1] = 10;
                                } else {
                                    if (features[5] <= 29.850000381469727) {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    }
                                }
                            }
                        } else {
                            if (features[3] <= 0.5) {
                                if (features[5] <= 37.54999923706055) {
                                    classes[0] = 8;
                                    classes[1] = 4;
                                } else {
                                    if (features[6] <= 1.0) {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[6] <= 0.5) {
                                    classes[0] = 2;
                                    classes[1] = 8;
                                } else {
                                    if (features[2] <= 36.5) {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 4;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 31.160400390625) {
                            classes[0] = 6;
                            classes[1] = 1;
                        } else {
                            classes[0] = 11;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[6] <= 0.5) {
                        if (features[5] <= 14.850000381469727) {
                            if (features[5] <= 7.227099895477295) {
                                classes[0] = 9;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 7.5625) {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            classes[0] = 7;
                            classes[1] = 7;
                        }
                    } else {
                        if (features[5] <= 51.697898864746094) {
                            if (features[5] <= 13.25) {
                                if (features[2] <= 23.5) {
                                    if (features[2] <= 17.5) {
                                        classes[0] = 9;
                                        classes[1] = 2;
                                    } else {
                                        if (features[5] <= 8.104150772094727) {
                                            if (features[5] <= 7.987500190734863) {
                                                if (features[5] <= 7.797900199890137) {
                                                    if (features[2] <= 20.75) {
                                                        classes[0] = 13;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 1;
                                                    }
                                                } else {
                                                    classes[0] = 22;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 28;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    if (features[2] <= 27.5) {
                                        if (features[5] <= 7.195849895477295) {
                                            classes[0] = 5;
                                            classes[1] = 5;
                                        } else {
                                            if (features[5] <= 7.845800399780273) {
                                                classes[0] = 9;
                                                classes[1] = 3;
                                            } else {
                                                if (features[2] <= 25.5) {
                                                    classes[0] = 12;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 1;
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 7.910400390625) {
                                            if (features[2] <= 29.349559783935547) {
                                                classes[0] = 10;
                                                classes[1] = 2;
                                            } else {
                                                if (features[5] <= 7.762499809265137) {
                                                    classes[0] = 51;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 7.875) {
                                                        classes[0] = 6;
                                                        classes[1] = 2;
                                                    } else {
                                                        classes[0] = 16;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[5] <= 7.987500190734863) {
                                                classes[0] = 5;
                                                classes[1] = 6;
                                            } else {
                                                if (features[5] <= 12.762499809265137) {
                                                    if (features[2] <= 29.849559783935547) {
                                                        classes[0] = 18;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[2] <= 32.5) {
                                                            classes[0] = 13;
                                                            classes[1] = 3;
                                                        } else {
                                                            if (features[2] <= 53.25) {
                                                                classes[0] = 13;
                                                                classes[1] = 0;
                                                            } else {
                                                                classes[0] = 5;
                                                                classes[1] = 1;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (features[2] <= 37.5) {
                                                        classes[0] = 3;
                                                        classes[1] = 3;
                                                    } else {
                                                        classes[0] = 9;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[3] <= 1.5) {
                                    classes[0] = 58;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 1;
                                }
                            }
                        } else {
                            classes[0] = 9;
                            classes[1] = 4;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_15(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 5.5) {
                    classes[0] = 2;
                    classes[1] = 6;
                } else {
                    if (features[2] <= 49.5) {
                        if (features[5] <= 13.25) {
                            if (features[5] <= 12.675000190734863) {
                                classes[0] = 0;
                                classes[1] = 8;
                            } else {
                                if (features[2] <= 29.0) {
                                    classes[0] = 1;
                                    classes[1] = 9;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 15;
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 100;
                        }
                    } else {
                        if (features[5] <= 40.095848083496094) {
                            classes[0] = 3;
                            classes[1] = 5;
                        } else {
                            classes[0] = 0;
                            classes[1] = 13;
                        }
                    }
                }
            } else {
                if (features[5] <= 7.987500190734863) {
                    if (features[5] <= 7.866700172424316) {
                        if (features[5] <= 7.741650104522705) {
                            classes[0] = 2;
                            classes[1] = 9;
                        } else {
                            if (features[6] <= 1.5) {
                                classes[0] = 8;
                                classes[1] = 16;
                            } else {
                                classes[0] = 8;
                                classes[1] = 5;
                            }
                        }
                    } else {
                        classes[0] = 1;
                        classes[1] = 14;
                    }
                } else {
                    if (features[2] <= 7.0) {
                        classes[0] = 3;
                        classes[1] = 9;
                    } else {
                        if (features[2] <= 23.0) {
                            if (features[5] <= 12.847949981689453) {
                                classes[0] = 8;
                                classes[1] = 2;
                            } else {
                                classes[0] = 17;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[2] <= 27.5) {
                                classes[0] = 1;
                                classes[1] = 6;
                            } else {
                                if (features[2] <= 30.5) {
                                    if (features[6] <= 1.5) {
                                        classes[0] = 4;
                                        classes[1] = 3;
                                    } else {
                                        if (features[5] <= 15.25) {
                                            classes[0] = 11;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    if (features[2] <= 38.5) {
                                        classes[0] = 1;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[2] <= 41.0) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 7;
                        classes[1] = 0;
                    } else {
                        if (features[2] <= 31.5) {
                            if (features[2] <= 28.849559783935547) {
                                if (features[4] <= 0.5) {
                                    classes[0] = 2;
                                    classes[1] = 9;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 13;
                                classes[1] = 1;
                            }
                        } else {
                            if (features[5] <= 35.5625) {
                                classes[0] = 1;
                                classes[1] = 12;
                            } else {
                                classes[0] = 4;
                                classes[1] = 7;
                            }
                        }
                    }
                } else {
                    if (features[6] <= 1.0) {
                        if (features[3] <= 0.5) {
                            classes[0] = 9;
                            classes[1] = 2;
                        } else {
                            classes[0] = 4;
                            classes[1] = 7;
                        }
                    } else {
                        if (features[5] <= 27.524999618530273) {
                            classes[0] = 3;
                            classes[1] = 3;
                        } else {
                            classes[0] = 19;
                            classes[1] = 0;
                        }
                    }
                }
            } else {
                if (features[2] <= 10.0) {
                    if (features[3] <= 2.5) {
                        classes[0] = 0;
                        classes[1] = 14;
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                    }
                } else {
                    if (features[2] <= 29.849559783935547) {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 7.745850086212158) {
                                if (features[5] <= 7.227099895477295) {
                                    classes[0] = 7;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 27.349559783935547) {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 2;
                                    }
                                }
                            } else {
                                if (features[5] <= 15.372900009155273) {
                                    if (features[5] <= 10.879150390625) {
                                        classes[0] = 14;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 7;
                                    }
                                } else {
                                    classes[0] = 12;
                                    classes[1] = 2;
                                }
                            }
                        } else {
                            if (features[5] <= 8.135400772094727) {
                                if (features[2] <= 20.25) {
                                    if (features[5] <= 7.889599800109863) {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 8;
                                    }
                                } else {
                                    if (features[5] <= 7.824999809265137) {
                                        if (features[5] <= 7.712500095367432) {
                                            if (features[5] <= 7.195849895477295) {
                                                if (features[2] <= 28.0) {
                                                    classes[0] = 5;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                classes[0] = 19;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 5;
                                        }
                                    } else {
                                        if (features[5] <= 7.987500190734863) {
                                            classes[0] = 32;
                                            classes[1] = 0;
                                        } else {
                                            if (features[2] <= 29.349559783935547) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 13;
                                                classes[1] = 4;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 28.75) {
                                    if (features[5] <= 43.29375076293945) {
                                        if (features[2] <= 19.5) {
                                            if (features[2] <= 18.5) {
                                                classes[0] = 16;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 44;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    }
                                } else {
                                    if (features[3] <= 0.5) {
                                        classes[0] = 5;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 7.987500190734863) {
                            if (features[5] <= 7.875) {
                                classes[0] = 38;
                                classes[1] = 0;
                            } else {
                                classes[0] = 6;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[2] <= 41.5) {
                                classes[0] = 65;
                                classes[1] = 0;
                            } else {
                                if (features[2] <= 43.5) {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 25;
                                    classes[1] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_16(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 13.5) {
                    classes[0] = 1;
                    classes[1] = 4;
                } else {
                    classes[0] = 0;
                    classes[1] = 173;
                }
            } else {
                if (features[6] <= 1.5) {
                    if (features[5] <= 15.620849609375) {
                        if (features[2] <= 21.5) {
                            if (features[5] <= 9.63545036315918) {
                                classes[0] = 4;
                                classes[1] = 4;
                            } else {
                                classes[0] = 8;
                                classes[1] = 2;
                            }
                        } else {
                            if (features[5] <= 11.5625) {
                                if (features[5] <= 7.743750095367432) {
                                    classes[0] = 3;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 14;
                                }
                            } else {
                                classes[0] = 4;
                                classes[1] = 5;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 12;
                    }
                } else {
                    if (features[5] <= 17.700000762939453) {
                        if (features[5] <= 10.824999809265137) {
                            if (features[5] <= 7.987500190734863) {
                                if (features[2] <= 22.5) {
                                    classes[0] = 2;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 6;
                                }
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    classes[0] = 15;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 3;
                                }
                            }
                        } else {
                            if (features[2] <= 28.849559783935547) {
                                classes[0] = 2;
                                classes[1] = 5;
                            } else {
                                classes[0] = 2;
                                classes[1] = 6;
                            }
                        }
                    } else {
                        if (features[2] <= 33.0) {
                            if (features[5] <= 31.331249237060547) {
                                classes[0] = 22;
                                classes[1] = 0;
                            } else {
                                classes[0] = 8;
                                classes[1] = 1;
                            }
                        } else {
                            classes[0] = 6;
                            classes[1] = 2;
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[4] <= 1.5) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 9;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 30.597900390625) {
                            if (features[6] <= 1.0) {
                                classes[0] = 4;
                                classes[1] = 1;
                            } else {
                                if (features[2] <= 54.0) {
                                    if (features[2] <= 31.849559783935547) {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 12;
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 1;
                                }
                            }
                        } else {
                            if (features[3] <= 0.5) {
                                if (features[6] <= 1.0) {
                                    if (features[5] <= 62.66874694824219) {
                                        classes[0] = 8;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 4;
                                    }
                                } else {
                                    if (features[5] <= 37.0) {
                                        classes[0] = 7;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 17;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[5] <= 59.087501525878906) {
                                    if (features[2] <= 34.0) {
                                        classes[0] = 2;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 5;
                                    }
                                } else {
                                    if (features[2] <= 47.5) {
                                        classes[0] = 10;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 4;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    classes[0] = 1;
                    classes[1] = 7;
                }
            } else {
                if (features[2] <= 14.0) {
                    if (features[3] <= 2.0) {
                        classes[0] = 0;
                        classes[1] = 14;
                    } else {
                        if (features[5] <= 30.200000762939453) {
                            classes[0] = 12;
                            classes[1] = 0;
                        } else {
                            classes[0] = 5;
                            classes[1] = 1;
                        }
                    }
                } else {
                    if (features[2] <= 32.25) {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 7.745850086212158) {
                                if (features[6] <= 0.5) {
                                    if (features[5] <= 7.227099895477295) {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[0] <= 2.5) {
                                    classes[0] = 8;
                                    classes[1] = 1;
                                } else {
                                    if (features[5] <= 14.850000381469727) {
                                        if (features[5] <= 7.789599895477295) {
                                            classes[0] = 9;
                                            classes[1] = 5;
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 6;
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 7.195849895477295) {
                                if (features[2] <= 28.0) {
                                    classes[0] = 4;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 11;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[2] <= 30.5) {
                                    if (features[5] <= 11.0) {
                                        if (features[5] <= 8.081250190734863) {
                                            if (features[2] <= 18.5) {
                                                classes[0] = 12;
                                                classes[1] = 3;
                                            } else {
                                                if (features[5] <= 7.797900199890137) {
                                                    if (features[5] <= 7.712500095367432) {
                                                        classes[0] = 17;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 4;
                                                    }
                                                } else {
                                                    classes[0] = 57;
                                                    classes[1] = 0;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 28.5) {
                                                if (features[2] <= 19.5) {
                                                    classes[0] = 4;
                                                    classes[1] = 2;
                                                } else {
                                                    if (features[5] <= 9.287500381469727) {
                                                        classes[0] = 5;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 10;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            } else {
                                                classes[0] = 3;
                                                classes[1] = 3;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 41.247901916503906) {
                                            classes[0] = 36;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 13;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 3;
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 41.25) {
                            classes[0] = 55;
                            classes[1] = 0;
                        } else {
                            if (features[2] <= 45.25) {
                                if (features[5] <= 8.533349990844727) {
                                    classes[0] = 11;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 35;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_17(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 13.25) {
                    if (features[5] <= 12.824999809265137) {
                        if (features[2] <= 29.5) {
                            classes[0] = 0;
                            classes[1] = 9;
                        } else {
                            classes[0] = 1;
                            classes[1] = 7;
                        }
                    } else {
                        classes[0] = 5;
                        classes[1] = 9;
                    }
                } else {
                    if (features[2] <= 26.5) {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 28;
                        } else {
                            if (features[2] <= 22.5) {
                                classes[0] = 1;
                                classes[1] = 14;
                            } else {
                                classes[0] = 4;
                                classes[1] = 5;
                            }
                        }
                    } else {
                        if (features[2] <= 49.5) {
                            classes[0] = 0;
                            classes[1] = 70;
                        } else {
                            if (features[2] <= 53.5) {
                                classes[0] = 1;
                                classes[1] = 5;
                            } else {
                                classes[0] = 0;
                                classes[1] = 10;
                            }
                        }
                    }
                }
            } else {
                if (features[5] <= 23.700000762939453) {
                    if (features[4] <= 1.5) {
                        if (features[5] <= 7.762499809265137) {
                            if (features[2] <= 26.349559783935547) {
                                if (features[5] <= 7.600000381469727) {
                                    classes[0] = 1;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 9;
                                }
                            } else {
                                classes[0] = 7;
                                classes[1] = 10;
                            }
                        } else {
                            if (features[2] <= 6.5) {
                                classes[0] = 3;
                                classes[1] = 9;
                            } else {
                                if (features[2] <= 28.849559783935547) {
                                    if (features[5] <= 13.4375) {
                                        if (features[5] <= 9.100000381469727) {
                                            classes[0] = 16;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 6;
                                        }
                                    } else {
                                        classes[0] = 14;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[5] <= 15.0) {
                                        if (features[5] <= 9.079150199890137) {
                                            classes[0] = 3;
                                            classes[1] = 4;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 10;
                    }
                } else {
                    classes[0] = 21;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[5] <= 15.172900199890137) {
                if (features[2] <= 16.5) {
                    classes[0] = 7;
                    classes[1] = 5;
                } else {
                    if (features[5] <= 7.910400390625) {
                        if (features[2] <= 29.349559783935547) {
                            if (features[2] <= 23.75) {
                                if (features[2] <= 19.5) {
                                    classes[0] = 16;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 21.5) {
                                        classes[0] = 10;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[5] <= 7.762499809265137) {
                                    classes[0] = 8;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 1;
                                }
                            }
                        } else {
                            if (features[2] <= 29.849559783935547) {
                                if (features[5] <= 7.227099895477295) {
                                    classes[0] = 17;
                                    classes[1] = 0;
                                } else {
                                    if (features[6] <= 0.5) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        if (features[5] <= 7.762499809265137) {
                                            classes[0] = 21;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 11;
                                            classes[1] = 2;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 61;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[5] <= 7.987500190734863) {
                            classes[0] = 7;
                            classes[1] = 6;
                        } else {
                            if (features[2] <= 19.5) {
                                classes[0] = 6;
                                classes[1] = 3;
                            } else {
                                if (features[2] <= 26.5) {
                                    classes[0] = 28;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 14.131250381469727) {
                                        if (features[2] <= 28.5) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            if (features[2] <= 29.849559783935547) {
                                                if (features[5] <= 9.097900390625) {
                                                    classes[0] = 19;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 4;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                if (features[5] <= 10.0) {
                                                    if (features[2] <= 32.5) {
                                                        classes[0] = 6;
                                                        classes[1] = 4;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 2;
                                                    }
                                                } else {
                                                    if (features[2] <= 33.5) {
                                                        classes[0] = 13;
                                                        classes[1] = 1;
                                                    } else {
                                                        if (features[2] <= 45.0) {
                                                            classes[0] = 7;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 8;
                                                            classes[1] = 1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 13;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[5] <= 16.0) {
                    classes[0] = 5;
                    classes[1] = 10;
                } else {
                    if (features[0] <= 1.5) {
                        if (features[2] <= 27.5) {
                            if (features[2] <= 24.5) {
                                classes[0] = 5;
                                classes[1] = 5;
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[5] <= 26.46875) {
                                classes[0] = 4;
                                classes[1] = 7;
                            } else {
                                if (features[3] <= 0.5) {
                                    if (features[5] <= 37.0) {
                                        if (features[5] <= 29.850000381469727) {
                                            if (features[5] <= 27.135398864746094) {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 10;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[5] <= 30.597900390625) {
                                                classes[0] = 1;
                                                classes[1] = 5;
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 5;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 69.63334655761719) {
                                            classes[0] = 25;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 10;
                                            classes[1] = 2;
                                        }
                                    }
                                } else {
                                    if (features[5] <= 59.087501525878906) {
                                        classes[0] = 5;
                                        classes[1] = 9;
                                    } else {
                                        if (features[5] <= 86.28959655761719) {
                                            classes[0] = 14;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 7;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[3] <= 0.5) {
                            if (features[2] <= 27.0) {
                                classes[0] = 6;
                                classes[1] = 7;
                            } else {
                                classes[0] = 9;
                                classes[1] = 2;
                            }
                        } else {
                            if (features[2] <= 3.0) {
                                classes[0] = 5;
                                classes[1] = 4;
                            } else {
                                classes[0] = 53;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_18(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 28.856250762939453) {
                    if (features[2] <= 37.0) {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 37;
                        } else {
                            classes[0] = 1;
                            classes[1] = 11;
                        }
                    } else {
                        if (features[2] <= 44.5) {
                            classes[0] = 4;
                            classes[1] = 5;
                        } else {
                            classes[0] = 2;
                            classes[1] = 12;
                        }
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 84;
                    } else {
                        classes[0] = 1;
                        classes[1] = 10;
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[2] <= 30.099559783935547) {
                        if (features[2] <= 6.5) {
                            classes[0] = 1;
                            classes[1] = 17;
                        } else {
                            if (features[2] <= 14.75) {
                                classes[0] = 11;
                                classes[1] = 1;
                            } else {
                                if (features[5] <= 8.039600372314453) {
                                    if (features[6] <= 1.5) {
                                        if (features[5] <= 7.768750190734863) {
                                            if (features[5] <= 7.735400199890137) {
                                                classes[0] = 1;
                                                classes[1] = 6;
                                            } else {
                                                classes[0] = 1;
                                                classes[1] = 11;
                                            }
                                        } else {
                                            classes[0] = 0;
                                            classes[1] = 8;
                                        }
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 11;
                                    }
                                } else {
                                    if (features[5] <= 15.372900009155273) {
                                        if (features[2] <= 21.0) {
                                            classes[0] = 4;
                                            classes[1] = 4;
                                        } else {
                                            classes[0] = 12;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 14;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 15.175000190734863) {
                            classes[0] = 10;
                            classes[1] = 0;
                        } else {
                            classes[0] = 2;
                            classes[1] = 4;
                        }
                    }
                } else {
                    if (features[3] <= 1.5) {
                        classes[0] = 12;
                        classes[1] = 5;
                    } else {
                        classes[0] = 15;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    if (features[3] <= 0.5) {
                        classes[0] = 1;
                        classes[1] = 8;
                    } else {
                        classes[0] = 0;
                        classes[1] = 19;
                    }
                } else {
                    if (features[2] <= 3.5) {
                        classes[0] = 4;
                        classes[1] = 2;
                    } else {
                        classes[0] = 9;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[5] <= 7.910400390625) {
                        if (features[2] <= 25.5) {
                            if (features[2] <= 24.5) {
                                if (features[6] <= 1.0) {
                                    classes[0] = 5;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 27;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 2;
                            }
                        } else {
                            if (features[5] <= 7.741650104522705) {
                                classes[0] = 53;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 7.86460018157959) {
                                    if (features[5] <= 7.8125) {
                                        if (features[2] <= 30.349559783935547) {
                                            classes[0] = 19;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 35;
                                    classes[1] = 0;
                                }
                            }
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            classes[0] = 5;
                            classes[1] = 5;
                        } else {
                            if (features[2] <= 26.5) {
                                if (features[2] <= 19.5) {
                                    if (features[5] <= 11.0) {
                                        classes[0] = 6;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 49;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 13.25) {
                                    if (features[5] <= 8.081250190734863) {
                                        if (features[5] <= 7.987500190734863) {
                                            classes[0] = 6;
                                            classes[1] = 3;
                                        } else {
                                            if (features[2] <= 32.5) {
                                                classes[0] = 11;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 1;
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 31.5) {
                                            if (features[2] <= 29.349559783935547) {
                                                classes[0] = 6;
                                                classes[1] = 3;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 10;
                                            }
                                        } else {
                                            if (features[2] <= 40.5) {
                                                classes[0] = 12;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 49.0) {
                                                    classes[0] = 6;
                                                    classes[1] = 5;
                                                } else {
                                                    classes[0] = 12;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 25.962499618530273) {
                                        classes[0] = 39;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 35.5) {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 53.0) {
                        if (features[0] <= 1.5) {
                            if (features[5] <= 27.135398864746094) {
                                classes[0] = 1;
                                classes[1] = 7;
                            } else {
                                if (features[2] <= 36.5) {
                                    if (features[2] <= 30.5) {
                                        if (features[5] <= 123.25830078125) {
                                            if (features[2] <= 28.5) {
                                                if (features[2] <= 24.5) {
                                                    classes[0] = 6;
                                                    classes[1] = 7;
                                                } else {
                                                    classes[0] = 1;
                                                    classes[1] = 10;
                                                }
                                            } else {
                                                classes[0] = 11;
                                                classes[1] = 8;
                                            }
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    }
                                } else {
                                    if (features[2] <= 47.5) {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 69.05419921875) {
                                            classes[0] = 3;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[3] <= 0.5) {
                                classes[0] = 4;
                                classes[1] = 5;
                            } else {
                                classes[0] = 18;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[2] <= 64.5) {
                            classes[0] = 16;
                            classes[1] = 0;
                        } else {
                            classes[0] = 7;
                            classes[1] = 1;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_19(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 13.39585018157959) {
                    if (features[2] <= 33.25) {
                        if (features[5] <= 12.675000190734863) {
                            classes[0] = 0;
                            classes[1] = 10;
                        } else {
                            classes[0] = 3;
                            classes[1] = 5;
                        }
                    } else {
                        classes[0] = 4;
                        classes[1] = 6;
                    }
                } else {
                    if (features[2] <= 7.0) {
                        classes[0] = 1;
                        classes[1] = 6;
                    } else {
                        if (features[5] <= 28.856250762939453) {
                            if (features[4] <= 0.5) {
                                if (features[5] <= 24.964599609375) {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 14;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 16;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 93;
                        }
                    }
                }
            } else {
                if (features[5] <= 24.808349609375) {
                    if (features[2] <= 37.5) {
                        if (features[5] <= 15.620849609375) {
                            if (features[5] <= 13.464599609375) {
                                if (features[5] <= 10.824999809265137) {
                                    if (features[5] <= 7.887499809265137) {
                                        if (features[5] <= 7.78125) {
                                            if (features[2] <= 23.5) {
                                                classes[0] = 3;
                                                classes[1] = 12;
                                            } else {
                                                classes[0] = 8;
                                                classes[1] = 7;
                                            }
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 11;
                                        }
                                    } else {
                                        if (features[2] <= 19.0) {
                                            classes[0] = 1;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 26.0) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 3;
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                }
                            } else {
                                classes[0] = 8;
                                classes[1] = 1;
                            }
                        } else {
                            if (features[2] <= 29.349559783935547) {
                                classes[0] = 6;
                                classes[1] = 9;
                            } else {
                                classes[0] = 0;
                                classes[1] = 13;
                            }
                        }
                    } else {
                        classes[0] = 10;
                        classes[1] = 1;
                    }
                } else {
                    if (features[4] <= 4.5) {
                        classes[0] = 17;
                        classes[1] = 0;
                    } else {
                        classes[0] = 7;
                        classes[1] = 2;
                    }
                }
            }
        } else {
            if (features[5] <= 26.268749237060547) {
                if (features[2] <= 14.0) {
                    classes[0] = 3;
                    classes[1] = 9;
                } else {
                    if (features[6] <= 0.5) {
                        if (features[5] <= 15.047900199890137) {
                            if (features[2] <= 29.849559783935547) {
                                if (features[5] <= 7.5625) {
                                    if (features[2] <= 26.0) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 4;
                            classes[1] = 6;
                        }
                    } else {
                        if (features[2] <= 27.5) {
                            if (features[2] <= 26.5) {
                                if (features[5] <= 7.195849895477295) {
                                    classes[0] = 11;
                                    classes[1] = 5;
                                } else {
                                    if (features[2] <= 19.5) {
                                        if (features[5] <= 7.972900390625) {
                                            classes[0] = 12;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 8.229150772094727) {
                                                classes[0] = 3;
                                                classes[1] = 3;
                                            } else {
                                                if (features[5] <= 11.0) {
                                                    classes[0] = 7;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[3] <= 0.5) {
                                            classes[0] = 59;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 12.381250381469727) {
                                                classes[0] = 4;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 5;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[5] <= 7.743750095367432) {
                                classes[0] = 45;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 13.25) {
                                    if (features[5] <= 12.762499809265137) {
                                        if (features[5] <= 8.237500190734863) {
                                            if (features[5] <= 7.910400390625) {
                                                if (features[5] <= 7.86460018157959) {
                                                    if (features[2] <= 32.5) {
                                                        if (features[6] <= 1.5) {
                                                            classes[0] = 14;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 4;
                                                            classes[1] = 2;
                                                        }
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    classes[0] = 27;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[2] <= 33.0) {
                                                    classes[0] = 18;
                                                    classes[1] = 4;
                                                } else {
                                                    classes[0] = 14;
                                                    classes[1] = 1;
                                                }
                                            }
                                        } else {
                                            classes[0] = 31;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[2] <= 36.5) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    if (features[5] <= 25.962499618530273) {
                                        classes[0] = 44;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 14;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[5] <= 26.774999618530273) {
                    if (features[2] <= 35.5) {
                        classes[0] = 2;
                        classes[1] = 8;
                    } else {
                        classes[0] = 1;
                        classes[1] = 8;
                    }
                } else {
                    if (features[3] <= 2.5) {
                        if (features[2] <= 27.5) {
                            if (features[2] <= 25.5) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 2;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[4] <= 0.5) {
                                if (features[6] <= 1.5) {
                                    if (features[5] <= 30.197900772094727) {
                                        classes[0] = 5;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 1;
                                    }
                                } else {
                                    if (features[5] <= 51.931251525878906) {
                                        if (features[5] <= 30.75) {
                                            classes[0] = 3;
                                            classes[1] = 6;
                                        } else {
                                            if (features[5] <= 35.25) {
                                                classes[0] = 8;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 2;
                                            }
                                        }
                                    } else {
                                        if (features[3] <= 0.5) {
                                            classes[0] = 6;
                                            classes[1] = 5;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 8;
                                        }
                                    }
                                }
                            } else {
                                if (features[5] <= 70.8145980834961) {
                                    classes[0] = 14;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 2;
                                }
                            }
                        }
                    } else {
                        classes[0] = 22;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_20(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 29.356250762939453) {
                    if (features[3] <= 0.5) {
                        if (features[2] <= 49.0) {
                            if (features[5] <= 13.25) {
                                if (features[2] <= 28.5) {
                                    classes[0] = 1;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 5;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 18;
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 5;
                        }
                    } else {
                        if (features[2] <= 27.5) {
                            classes[0] = 6;
                            classes[1] = 7;
                        } else {
                            classes[0] = 0;
                            classes[1] = 8;
                        }
                    }
                } else {
                    classes[0] = 0;
                    classes[1] = 81;
                }
            } else {
                if (features[5] <= 22.904150009155273) {
                    if (features[5] <= 15.372900009155273) {
                        if (features[5] <= 8.039600372314453) {
                            if (features[6] <= 1.5) {
                                if (features[2] <= 17.0) {
                                    classes[0] = 0;
                                    classes[1] = 5;
                                } else {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 1;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 11;
                                    }
                                }
                            } else {
                                if (features[2] <= 23.5) {
                                    classes[0] = 4;
                                    classes[1] = 9;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[2] <= 16.0) {
                                classes[0] = 7;
                                classes[1] = 7;
                            } else {
                                if (features[5] <= 11.495849609375) {
                                    classes[0] = 16;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 14;
                                    classes[1] = 2;
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 19.735401153564453) {
                            if (features[6] <= 1.5) {
                                classes[0] = 0;
                                classes[1] = 11;
                            } else {
                                classes[0] = 4;
                                classes[1] = 13;
                            }
                        } else {
                            classes[0] = 4;
                            classes[1] = 3;
                        }
                    }
                } else {
                    classes[0] = 24;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[5] <= 15.172900199890137) {
                if (features[2] <= 16.5) {
                    classes[0] = 5;
                    classes[1] = 3;
                } else {
                    if (features[5] <= 7.910400390625) {
                        if (features[2] <= 32.5) {
                            if (features[2] <= 30.5) {
                                if (features[6] <= 0.5) {
                                    if (features[5] <= 7.227099895477295) {
                                        classes[0] = 12;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 4;
                                    }
                                } else {
                                    if (features[5] <= 7.797900199890137) {
                                        if (features[5] <= 7.785400390625) {
                                            if (features[2] <= 23.0) {
                                                classes[0] = 22;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 29.349559783935547) {
                                                    if (features[2] <= 25.5) {
                                                        classes[0] = 7;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 4;
                                                        classes[1] = 2;
                                                    }
                                                } else {
                                                    if (features[5] <= 7.743750095367432) {
                                                        classes[0] = 16;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 15;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        classes[0] = 39;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 6;
                                classes[1] = 2;
                            }
                        } else {
                            classes[0] = 39;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[5] <= 7.987500190734863) {
                            classes[0] = 6;
                            classes[1] = 5;
                        } else {
                            if (features[2] <= 29.849559783935547) {
                                if (features[2] <= 19.5) {
                                    if (features[5] <= 9.416650772094727) {
                                        classes[0] = 4;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[2] <= 26.5) {
                                        classes[0] = 37;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 28.5) {
                                            classes[0] = 8;
                                            classes[1] = 2;
                                        } else {
                                            if (features[5] <= 12.181249618530273) {
                                                classes[0] = 22;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 34.5) {
                                    if (features[2] <= 31.5) {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 4;
                                    }
                                } else {
                                    if (features[2] <= 40.5) {
                                        classes[0] = 11;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 46.0) {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        } else {
                                            if (features[5] <= 11.425000190734863) {
                                                classes[0] = 7;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 11;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (features[2] <= 1.5) {
                    classes[0] = 2;
                    classes[1] = 12;
                } else {
                    if (features[0] <= 1.5) {
                        if (features[2] <= 53.0) {
                            if (features[5] <= 27.135398864746094) {
                                if (features[2] <= 35.5) {
                                    classes[0] = 3;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 9;
                                }
                            } else {
                                if (features[2] <= 47.5) {
                                    if (features[4] <= 0.5) {
                                        if (features[2] <= 43.0) {
                                            if (features[5] <= 52.277099609375) {
                                                if (features[5] <= 30.597900390625) {
                                                    classes[0] = 8;
                                                    classes[1] = 4;
                                                } else {
                                                    if (features[5] <= 39.86249923706055) {
                                                        classes[0] = 7;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            } else {
                                                if (features[2] <= 30.349559783935547) {
                                                    classes[0] = 9;
                                                    classes[1] = 2;
                                                } else {
                                                    classes[0] = 2;
                                                    classes[1] = 6;
                                                }
                                            }
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[2] <= 23.5) {
                                            classes[0] = 1;
                                            classes[1] = 7;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 5;
                                        }
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 11;
                                }
                            }
                        } else {
                            if (features[6] <= 1.0) {
                                classes[0] = 5;
                                classes[1] = 3;
                            } else {
                                if (features[2] <= 61.5) {
                                    classes[0] = 13;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 16.0) {
                            classes[0] = 7;
                            classes[1] = 7;
                        } else {
                            if (features[2] <= 9.5) {
                                if (features[3] <= 3.5) {
                                    classes[0] = 2;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 12;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 51.697898864746094) {
                                    if (features[6] <= 1.5) {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    } else {
                                        if (features[2] <= 31.0) {
                                            classes[0] = 28;
                                            classes[1] = 0;
                                        } else {
                                            if (features[2] <= 41.0) {
                                                classes[0] = 5;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 12;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 3;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_21(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[2] <= 27.5) {
                        if (features[2] <= 23.5) {
                            classes[0] = 0;
                            classes[1] = 13;
                        } else {
                            classes[0] = 5;
                            classes[1] = 11;
                        }
                    } else {
                        if (features[5] <= 12.824999809265137) {
                            classes[0] = 2;
                            classes[1] = 5;
                        } else {
                            classes[0] = 0;
                            classes[1] = 33;
                        }
                    }
                } else {
                    if (features[5] <= 149.035400390625) {
                        classes[0] = 0;
                        classes[1] = 100;
                    } else {
                        if (features[2] <= 27.0) {
                            classes[0] = 2;
                            classes[1] = 4;
                        } else {
                            classes[0] = 0;
                            classes[1] = 13;
                        }
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[5] <= 15.372900009155273) {
                        if (features[5] <= 8.039600372314453) {
                            if (features[6] <= 1.5) {
                                if (features[5] <= 7.768750190734863) {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 2;
                                        classes[1] = 9;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 7;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 9;
                                }
                            } else {
                                if (features[5] <= 7.875) {
                                    classes[0] = 11;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 3;
                                }
                            }
                        } else {
                            if (features[4] <= 0.5) {
                                if (features[2] <= 26.849559783935547) {
                                    classes[0] = 14;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 12;
                                    classes[1] = 2;
                                }
                            } else {
                                if (features[5] <= 13.935449600219727) {
                                    classes[0] = 3;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                }
                            }
                        }
                    } else {
                        if (features[6] <= 1.5) {
                            classes[0] = 0;
                            classes[1] = 9;
                        } else {
                            if (features[2] <= 21.0) {
                                classes[0] = 6;
                                classes[1] = 2;
                            } else {
                                classes[0] = 3;
                                classes[1] = 16;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 32.881248474121094) {
                        if (features[5] <= 30.200000762939453) {
                            classes[0] = 11;
                            classes[1] = 1;
                        } else {
                            classes[0] = 6;
                            classes[1] = 3;
                        }
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[2] <= 6.5) {
                if (features[3] <= 2.5) {
                    classes[0] = 0;
                    classes[1] = 11;
                } else {
                    classes[0] = 5;
                    classes[1] = 2;
                }
            } else {
                if (features[5] <= 26.318750381469727) {
                    if (features[4] <= 0.5) {
                        if (features[2] <= 45.25) {
                            if (features[5] <= 13.25) {
                                if (features[2] <= 29.849559783935547) {
                                    if (features[2] <= 29.349559783935547) {
                                        if (features[5] <= 7.824999809265137) {
                                            if (features[2] <= 19.5) {
                                                classes[0] = 11;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 7.699999809265137) {
                                                    if (features[5] <= 7.183349609375) {
                                                        classes[0] = 5;
                                                        classes[1] = 4;
                                                    } else {
                                                        classes[0] = 12;
                                                        classes[1] = 1;
                                                    }
                                                } else {
                                                    classes[0] = 8;
                                                    classes[1] = 6;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 20.5) {
                                                if (features[5] <= 8.104150772094727) {
                                                    classes[0] = 2;
                                                    classes[1] = 4;
                                                } else {
                                                    if (features[0] <= 2.5) {
                                                        classes[0] = 5;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            } else {
                                                if (features[2] <= 26.5) {
                                                    classes[0] = 46;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 9.491649627685547) {
                                                        classes[0] = 9;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 7.762499809265137) {
                                            classes[0] = 49;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 7.972900390625) {
                                                classes[0] = 8;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 18;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 9.081250190734863) {
                                        if (features[2] <= 32.5) {
                                            classes[0] = 14;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 41.25) {
                                                classes[0] = 32;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 10;
                                                classes[1] = 1;
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 33.5) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 5;
                                        }
                                    }
                                }
                            } else {
                                if (features[6] <= 0.5) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 38;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            classes[0] = 42;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[5] <= 14.872900009155273) {
                            classes[0] = 9;
                            classes[1] = 0;
                        } else {
                            classes[0] = 6;
                            classes[1] = 5;
                        }
                    }
                } else {
                    if (features[4] <= 0.5) {
                        if (features[5] <= 59.052101135253906) {
                            if (features[5] <= 56.197898864746094) {
                                if (features[5] <= 30.597900390625) {
                                    if (features[5] <= 29.850000381469727) {
                                        if (features[5] <= 26.774999618530273) {
                                            classes[0] = 5;
                                            classes[1] = 8;
                                        } else {
                                            classes[0] = 9;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 9;
                                    }
                                } else {
                                    if (features[5] <= 51.247901916503906) {
                                        if (features[5] <= 37.54999923706055) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 10;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 2;
                                    }
                                }
                            } else {
                                classes[0] = 3;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[5] <= 84.5999984741211) {
                                classes[0] = 10;
                                classes[1] = 0;
                            } else {
                                classes[0] = 4;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        if (features[2] <= 12.5) {
                            classes[0] = 8;
                            classes[1] = 2;
                        } else {
                            if (features[2] <= 38.0) {
                                classes[0] = 11;
                                classes[1] = 1;
                            } else {
                                classes[0] = 20;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_22(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 149.035400390625) {
                    if (features[5] <= 29.356250762939453) {
                        if (features[2] <= 37.0) {
                            if (features[4] <= 0.5) {
                                classes[0] = 0;
                                classes[1] = 24;
                            } else {
                                if (features[2] <= 21.5) {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                }
                            }
                        } else {
                            if (features[5] <= 15.875) {
                                classes[0] = 2;
                                classes[1] = 5;
                            } else {
                                if (features[2] <= 48.5) {
                                    classes[0] = 1;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 85;
                    }
                } else {
                    if (features[2] <= 30.0) {
                        classes[0] = 3;
                        classes[1] = 8;
                    } else {
                        classes[0] = 0;
                        classes[1] = 9;
                    }
                }
            } else {
                if (features[6] <= 1.5) {
                    if (features[4] <= 0.5) {
                        if (features[5] <= 7.768750190734863) {
                            if (features[5] <= 7.743750095367432) {
                                classes[0] = 1;
                                classes[1] = 13;
                            } else {
                                classes[0] = 4;
                                classes[1] = 6;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 19;
                        }
                    } else {
                        if (features[2] <= 19.0) {
                            classes[0] = 2;
                            classes[1] = 7;
                        } else {
                            classes[0] = 9;
                            classes[1] = 2;
                        }
                    }
                } else {
                    if (features[5] <= 17.599998474121094) {
                        if (features[5] <= 11.402099609375) {
                            if (features[5] <= 9.13539981842041) {
                                if (features[2] <= 19.5) {
                                    classes[0] = 2;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 5;
                                }
                            } else {
                                classes[0] = 11;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 10;
                        }
                    } else {
                        if (features[2] <= 7.0) {
                            classes[0] = 3;
                            classes[1] = 4;
                        } else {
                            if (features[3] <= 1.5) {
                                classes[0] = 9;
                                classes[1] = 2;
                            } else {
                                classes[0] = 12;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 9.5) {
                if (features[3] <= 3.0) {
                    classes[0] = 0;
                    classes[1] = 17;
                } else {
                    classes[0] = 8;
                    classes[1] = 1;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 12;
                        classes[1] = 0;
                    } else {
                        if (features[2] <= 60.5) {
                            if (features[5] <= 27.135398864746094) {
                                classes[0] = 2;
                                classes[1] = 9;
                            } else {
                                if (features[6] <= 0.5) {
                                    if (features[5] <= 30.847900390625) {
                                        classes[0] = 11;
                                        classes[1] = 1;
                                    } else {
                                        if (features[5] <= 99.9896011352539) {
                                            if (features[3] <= 0.5) {
                                                classes[0] = 5;
                                                classes[1] = 6;
                                            } else {
                                                classes[0] = 0;
                                                classes[1] = 11;
                                            }
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        }
                                    }
                                } else {
                                    if (features[5] <= 30.75) {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    } else {
                                        if (features[5] <= 52.82709884643555) {
                                            if (features[2] <= 43.5) {
                                                if (features[5] <= 50.247901916503906) {
                                                    classes[0] = 5;
                                                    classes[1] = 4;
                                                } else {
                                                    classes[0] = 7;
                                                    classes[1] = 3;
                                                }
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            if (features[5] <= 86.73750305175781) {
                                                classes[0] = 15;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 14;
                            classes[1] = 1;
                        }
                    }
                } else {
                    if (features[2] <= 34.25) {
                        if (features[2] <= 30.75) {
                            if (features[6] <= 0.5) {
                                if (features[5] <= 15.147899627685547) {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 8;
                                        classes[1] = 5;
                                    } else {
                                        if (features[5] <= 7.5625) {
                                            classes[0] = 14;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 5;
                                }
                            } else {
                                if (features[5] <= 48.091651916503906) {
                                    if (features[5] <= 8.831250190734863) {
                                        if (features[2] <= 21.5) {
                                            if (features[5] <= 7.785400390625) {
                                                classes[0] = 8;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 7.987500190734863) {
                                                    classes[0] = 9;
                                                    classes[1] = 5;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 3;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 24.75) {
                                                classes[0] = 19;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 27.5) {
                                                    if (features[2] <= 25.5) {
                                                        classes[0] = 7;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 3;
                                                    }
                                                } else {
                                                    if (features[5] <= 7.743750095367432) {
                                                        classes[0] = 27;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[5] <= 7.762499809265137) {
                                                            classes[0] = 8;
                                                            classes[1] = 2;
                                                        } else {
                                                            if (features[5] <= 7.972900390625) {
                                                                classes[0] = 18;
                                                                classes[1] = 0;
                                                            } else {
                                                                classes[0] = 19;
                                                                classes[1] = 2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[6] <= 1.5) {
                                            classes[0] = 8;
                                            classes[1] = 2;
                                        } else {
                                            if (features[0] <= 2.5) {
                                                if (features[2] <= 20.0) {
                                                    classes[0] = 6;
                                                    classes[1] = 1;
                                                } else {
                                                    if (features[2] <= 28.5) {
                                                        classes[0] = 24;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            } else {
                                                classes[0] = 48;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[3] <= 1.0) {
                                        classes[0] = 7;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        } else {
                            if (features[3] <= 0.5) {
                                if (features[2] <= 32.5) {
                                    classes[0] = 7;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 8;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[2] <= 38.5) {
                            classes[0] = 35;
                            classes[1] = 0;
                        } else {
                            if (features[2] <= 45.25) {
                                if (features[5] <= 13.75) {
                                    if (features[2] <= 42.5) {
                                        classes[0] = 8;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 28;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_23(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 29.356250762939453) {
                    if (features[2] <= 43.0) {
                        if (features[2] <= 27.5) {
                            if (features[4] <= 0.5) {
                                classes[0] = 4;
                                classes[1] = 7;
                            } else {
                                classes[0] = 0;
                                classes[1] = 19;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 25;
                        }
                    } else {
                        classes[0] = 3;
                        classes[1] = 7;
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 77;
                    } else {
                        if (features[5] <= 135.77499389648438) {
                            classes[0] = 0;
                            classes[1] = 7;
                        } else {
                            classes[0] = 2;
                            classes[1] = 8;
                        }
                    }
                }
            } else {
                if (features[5] <= 22.904150009155273) {
                    if (features[2] <= 30.099559783935547) {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 12.847949981689453) {
                                if (features[5] <= 7.789599895477295) {
                                    if (features[5] <= 7.743750095367432) {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 8;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 10;
                                }
                            } else {
                                if (features[3] <= 0.5) {
                                    classes[0] = 3;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 3;
                                }
                            }
                        } else {
                            if (features[5] <= 17.25) {
                                if (features[5] <= 10.824999809265137) {
                                    if (features[5] <= 7.987500190734863) {
                                        if (features[2] <= 23.5) {
                                            classes[0] = 6;
                                            classes[1] = 8;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 4;
                                        }
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 9;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        if (features[2] <= 36.0) {
                            classes[0] = 4;
                            classes[1] = 2;
                        } else {
                            classes[0] = 8;
                            classes[1] = 1;
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 24;
                        classes[1] = 0;
                    } else {
                        classes[0] = 8;
                        classes[1] = 3;
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    classes[0] = 0;
                    classes[1] = 23;
                } else {
                    classes[0] = 17;
                    classes[1] = 0;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[5] <= 30.597900390625) {
                        if (features[2] <= 36.5) {
                            if (features[5] <= 26.337501525878906) {
                                classes[0] = 3;
                                classes[1] = 5;
                            } else {
                                classes[0] = 1;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[2] <= 53.5) {
                                classes[0] = 5;
                                classes[1] = 4;
                            } else {
                                classes[0] = 12;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        if (features[3] <= 0.5) {
                            if (features[2] <= 42.5) {
                                if (features[6] <= 1.0) {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                } else {
                                    if (features[5] <= 48.54999923706055) {
                                        classes[0] = 4;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                classes[0] = 19;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[6] <= 0.5) {
                                classes[0] = 5;
                                classes[1] = 5;
                            } else {
                                if (features[5] <= 64.0) {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 11;
                                    classes[1] = 1;
                                }
                            }
                        }
                    }
                } else {
                    if (features[0] <= 2.5) {
                        if (features[2] <= 53.0) {
                            if (features[2] <= 29.349559783935547) {
                                classes[0] = 52;
                                classes[1] = 0;
                            } else {
                                if (features[2] <= 32.5) {
                                    if (features[5] <= 11.75) {
                                        classes[0] = 11;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 14.456250190734863) {
                                            classes[0] = 3;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    if (features[2] <= 40.5) {
                                        classes[0] = 23;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 6;
                            classes[1] = 2;
                        }
                    } else {
                        if (features[2] <= 32.5) {
                            if (features[2] <= 30.75) {
                                if (features[6] <= 1.5) {
                                    if (features[5] <= 7.745850086212158) {
                                        if (features[2] <= 21.5) {
                                            classes[0] = 10;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 17;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[5] <= 14.850000381469727) {
                                            if (features[5] <= 7.789599895477295) {
                                                classes[0] = 5;
                                                classes[1] = 5;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 8;
                                        }
                                    }
                                } else {
                                    if (features[3] <= 0.5) {
                                        if (features[5] <= 7.195849895477295) {
                                            classes[0] = 5;
                                            classes[1] = 3;
                                        } else {
                                            if (features[2] <= 29.849559783935547) {
                                                if (features[2] <= 18.5) {
                                                    if (features[5] <= 8.175000190734863) {
                                                        classes[0] = 6;
                                                        classes[1] = 5;
                                                    } else {
                                                        classes[0] = 10;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    if (features[5] <= 7.797900199890137) {
                                                        if (features[5] <= 7.712500095367432) {
                                                            classes[0] = 13;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 5;
                                                            classes[1] = 6;
                                                        }
                                                    } else {
                                                        if (features[5] <= 14.800000190734863) {
                                                            if (features[5] <= 8.081250190734863) {
                                                                classes[0] = 51;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[2] <= 23.0) {
                                                                    classes[0] = 15;
                                                                    classes[1] = 0;
                                                                } else {
                                                                    classes[0] = 6;
                                                                    classes[1] = 2;
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 4;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 3;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 8.293750762939453) {
                                            classes[0] = 11;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 30;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 6;
                                classes[1] = 10;
                            }
                        } else {
                            if (features[5] <= 8.227100372314453) {
                                if (features[5] <= 7.910400390625) {
                                    classes[0] = 19;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 43.5) {
                                        classes[0] = 5;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    }
                                }
                            } else {
                                classes[0] = 22;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_24(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 27.5) {
                    if (features[2] <= 24.5) {
                        if (features[2] <= 5.5) {
                            classes[0] = 2;
                            classes[1] = 8;
                        } else {
                            if (features[5] <= 13.39585018157959) {
                                classes[0] = 1;
                                classes[1] = 5;
                            } else {
                                classes[0] = 0;
                                classes[1] = 42;
                            }
                        }
                    } else {
                        classes[0] = 3;
                        classes[1] = 4;
                    }
                } else {
                    if (features[5] <= 12.675000190734863) {
                        classes[0] = 1;
                        classes[1] = 4;
                    } else {
                        classes[0] = 0;
                        classes[1] = 99;
                    }
                }
            } else {
                if (features[5] <= 24.808349609375) {
                    if (features[2] <= 19.5) {
                        if (features[5] <= 13.935449600219727) {
                            if (features[2] <= 14.5) {
                                classes[0] = 2;
                                classes[1] = 9;
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        } else {
                            classes[0] = 4;
                            classes[1] = 12;
                        }
                    } else {
                        if (features[5] <= 7.887499809265137) {
                            if (features[5] <= 7.762499809265137) {
                                classes[0] = 7;
                                classes[1] = 14;
                            } else {
                                classes[0] = 0;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[5] <= 14.872900009155273) {
                                if (features[2] <= 26.0) {
                                    classes[0] = 13;
                                    classes[1] = 0;
                                } else {
                                    if (features[3] <= 0.5) {
                                        classes[0] = 6;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[5] <= 20.231250762939453) {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 18;
                        classes[1] = 0;
                    } else {
                        classes[0] = 13;
                        classes[1] = 2;
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[5] <= 30.597900390625) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 8;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 27.135398864746094) {
                            if (features[2] <= 43.5) {
                                classes[0] = 0;
                                classes[1] = 16;
                            } else {
                                classes[0] = 2;
                                classes[1] = 6;
                            }
                        } else {
                            if (features[2] <= 29.849559783935547) {
                                classes[0] = 4;
                                classes[1] = 4;
                            } else {
                                classes[0] = 4;
                                classes[1] = 4;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 50.5) {
                        if (features[5] <= 51.0) {
                            if (features[5] <= 39.04999923706055) {
                                classes[0] = 6;
                                classes[1] = 1;
                            } else {
                                classes[0] = 7;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[5] <= 77.00834655761719) {
                                if (features[5] <= 54.270851135253906) {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 9;
                                }
                            } else {
                                if (features[2] <= 32.34955978393555) {
                                    classes[0] = 16;
                                    classes[1] = 2;
                                } else {
                                    if (features[5] <= 113.2125015258789) {
                                        classes[0] = 8;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    }
                                }
                            }
                        }
                    } else {
                        classes[0] = 13;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[2] <= 3.5) {
                    if (features[3] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 8;
                    } else {
                        classes[0] = 5;
                        classes[1] = 1;
                    }
                } else {
                    if (features[6] <= 0.5) {
                        if (features[5] <= 13.368749618530273) {
                            if (features[2] <= 29.849559783935547) {
                                if (features[2] <= 24.25) {
                                    classes[0] = 3;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 11;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 15;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 6;
                            classes[1] = 10;
                        }
                    } else {
                        if (features[5] <= 13.554149627685547) {
                            if (features[5] <= 7.745850086212158) {
                                if (features[2] <= 27.349559783935547) {
                                    if (features[2] <= 23.0) {
                                        classes[0] = 19;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 35;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[2] <= 30.5) {
                                    if (features[5] <= 7.797900199890137) {
                                        if (features[5] <= 7.762499809265137) {
                                            classes[0] = 11;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 8;
                                            classes[1] = 5;
                                        }
                                    } else {
                                        if (features[2] <= 20.5) {
                                            if (features[5] <= 10.335399627685547) {
                                                if (features[5] <= 8.104150772094727) {
                                                    classes[0] = 7;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 19;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 4;
                                            }
                                        } else {
                                            if (features[5] <= 8.560400009155273) {
                                                classes[0] = 58;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 26.5) {
                                                    classes[0] = 18;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[0] <= 2.5) {
                                                        classes[0] = 14;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 7.910400390625) {
                                        classes[0] = 14;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 34.5) {
                                            classes[0] = 3;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 40.5) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 46.0) {
                                                    classes[0] = 7;
                                                    classes[1] = 5;
                                                } else {
                                                    classes[0] = 13;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 10.0) {
                                if (features[2] <= 7.5) {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 2;
                                }
                            } else {
                                if (features[6] <= 1.5) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 74;
                                    classes[1] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_25(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[2] <= 25.5) {
                        classes[0] = 0;
                        classes[1] = 18;
                    } else {
                        if (features[2] <= 39.0) {
                            if (features[2] <= 32.75) {
                                if (features[2] <= 28.5) {
                                    classes[0] = 2;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                }
                            } else {
                                classes[0] = 3;
                                classes[1] = 6;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 17;
                        }
                    }
                } else {
                    if (features[2] <= 11.0) {
                        classes[0] = 1;
                        classes[1] = 6;
                    } else {
                        classes[0] = 0;
                        classes[1] = 129;
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[5] <= 7.887499809265137) {
                        if (features[6] <= 1.5) {
                            if (features[5] <= 7.768750190734863) {
                                if (features[5] <= 7.743750095367432) {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 10;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        } else {
                            classes[0] = 7;
                            classes[1] = 6;
                        }
                    } else {
                        if (features[5] <= 15.372900009155273) {
                            if (features[5] <= 13.4375) {
                                if (features[5] <= 8.672900199890137) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    if (features[2] <= 24.5) {
                                        classes[0] = 3;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 5;
                                    }
                                }
                            } else {
                                if (features[2] <= 28.849559783935547) {
                                    classes[0] = 5;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[6] <= 1.5) {
                                classes[0] = 1;
                                classes[1] = 9;
                            } else {
                                if (features[5] <= 17.599998474121094) {
                                    classes[0] = 1;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 1;
                                }
                            }
                        }
                    }
                } else {
                    if (features[3] <= 1.5) {
                        classes[0] = 7;
                        classes[1] = 2;
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[2] <= 13.5) {
                if (features[3] <= 2.0) {
                    classes[0] = 0;
                    classes[1] = 17;
                } else {
                    classes[0] = 14;
                    classes[1] = 2;
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[2] <= 32.5) {
                        if (features[2] <= 30.75) {
                            if (features[6] <= 0.5) {
                                if (features[5] <= 11.287500381469727) {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 8;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 14;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 7.8125) {
                                    if (features[5] <= 7.745850086212158) {
                                        if (features[5] <= 7.195849895477295) {
                                            if (features[2] <= 28.349559783935547) {
                                                if (features[2] <= 23.0) {
                                                    classes[0] = 6;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                classes[0] = 14;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            classes[0] = 27;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[2] <= 23.5) {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        } else {
                                            if (features[2] <= 29.349559783935547) {
                                                classes[0] = 2;
                                                classes[1] = 3;
                                            } else {
                                                classes[0] = 9;
                                                classes[1] = 4;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 7.987500190734863) {
                                        classes[0] = 43;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 11.0) {
                                            if (features[5] <= 9.425000190734863) {
                                                if (features[2] <= 28.349559783935547) {
                                                    if (features[5] <= 8.831250190734863) {
                                                        if (features[2] <= 18.5) {
                                                            classes[0] = 7;
                                                            classes[1] = 2;
                                                        } else {
                                                            classes[0] = 9;
                                                            classes[1] = 2;
                                                        }
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    classes[0] = 21;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[2] <= 23.5) {
                                                    classes[0] = 10;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 3;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 29.099559783935547) {
                                                classes[0] = 33;
                                                classes[1] = 0;
                                            } else {
                                                if (features[3] <= 0.5) {
                                                    classes[0] = 6;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 15;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 8.206250190734863) {
                                classes[0] = 5;
                                classes[1] = 8;
                            } else {
                                classes[0] = 4;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        if (features[5] <= 11.387499809265137) {
                            if (features[5] <= 7.910400390625) {
                                classes[0] = 26;
                                classes[1] = 0;
                            } else {
                                if (features[2] <= 40.5) {
                                    classes[0] = 6;
                                    classes[1] = 2;
                                } else {
                                    if (features[2] <= 44.5) {
                                        classes[0] = 12;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 2;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 40;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[5] <= 27.135398864746094) {
                        classes[0] = 8;
                        classes[1] = 11;
                    } else {
                        if (features[5] <= 54.270851135253906) {
                            if (features[2] <= 47.5) {
                                if (features[2] <= 38.0) {
                                    if (features[2] <= 31.5) {
                                        if (features[5] <= 36.125) {
                                            classes[0] = 9;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 14;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 18;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 6;
                                classes[1] = 4;
                            }
                        } else {
                            if (features[5] <= 59.052101135253906) {
                                classes[0] = 2;
                                classes[1] = 9;
                            } else {
                                if (features[6] <= 0.5) {
                                    if (features[5] <= 99.9896011352539) {
                                        classes[0] = 2;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 3;
                                    }
                                } else {
                                    if (features[5] <= 86.73750305175781) {
                                        classes[0] = 13;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_26(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[2] <= 37.0) {
                        if (features[5] <= 20.25) {
                            classes[0] = 0;
                            classes[1] = 29;
                        } else {
                            if (features[2] <= 27.5) {
                                classes[0] = 3;
                                classes[1] = 3;
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        }
                    } else {
                        if (features[5] <= 14.375) {
                            classes[0] = 4;
                            classes[1] = 5;
                        } else {
                            classes[0] = 1;
                            classes[1] = 7;
                        }
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 97;
                    } else {
                        if (features[5] <= 68.0) {
                            classes[0] = 0;
                            classes[1] = 7;
                        } else {
                            classes[0] = 2;
                            classes[1] = 4;
                        }
                    }
                }
            } else {
                if (features[5] <= 22.904150009155273) {
                    if (features[2] <= 6.5) {
                        classes[0] = 0;
                        classes[1] = 12;
                    } else {
                        if (features[5] <= 7.887499809265137) {
                            if (features[6] <= 1.5) {
                                classes[0] = 2;
                                classes[1] = 24;
                            } else {
                                classes[0] = 5;
                                classes[1] = 5;
                            }
                        } else {
                            if (features[5] <= 15.372900009155273) {
                                if (features[4] <= 0.5) {
                                    if (features[3] <= 0.5) {
                                        if (features[5] <= 9.34375) {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                }
                            } else {
                                if (features[2] <= 27.849559783935547) {
                                    classes[0] = 8;
                                    classes[1] = 4;
                                } else {
                                    if (features[5] <= 16.75) {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 7;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[3] <= 1.5) {
                        classes[0] = 7;
                        classes[1] = 3;
                    } else {
                        if (features[2] <= 13.5) {
                            classes[0] = 8;
                            classes[1] = 1;
                        } else {
                            classes[0] = 9;
                            classes[1] = 0;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.5) {
                    if (features[2] <= 7.0) {
                        classes[0] = 0;
                        classes[1] = 15;
                    } else {
                        classes[0] = 1;
                        classes[1] = 6;
                    }
                } else {
                    if (features[5] <= 30.200000762939453) {
                        classes[0] = 8;
                        classes[1] = 0;
                    } else {
                        classes[0] = 6;
                        classes[1] = 1;
                    }
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 43.0) {
                        if (features[2] <= 24.5) {
                            classes[0] = 5;
                            classes[1] = 1;
                        } else {
                            if (features[2] <= 28.5) {
                                classes[0] = 0;
                                classes[1] = 9;
                            } else {
                                if (features[2] <= 31.5) {
                                    if (features[5] <= 42.75) {
                                        classes[0] = 7;
                                        classes[1] = 4;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    }
                                } else {
                                    if (features[2] <= 37.5) {
                                        classes[0] = 4;
                                        classes[1] = 10;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 53.95000076293945) {
                            if (features[5] <= 30.597900390625) {
                                classes[0] = 10;
                                classes[1] = 2;
                            } else {
                                classes[0] = 3;
                                classes[1] = 4;
                            }
                        } else {
                            if (features[6] <= 0.5) {
                                classes[0] = 12;
                                classes[1] = 1;
                            } else {
                                classes[0] = 5;
                                classes[1] = 1;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 32.25) {
                        if (features[2] <= 23.75) {
                            if (features[2] <= 21.5) {
                                if (features[2] <= 17.5) {
                                    classes[0] = 25;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 8.104150772094727) {
                                        if (features[5] <= 7.987500190734863) {
                                            if (features[2] <= 19.5) {
                                                classes[0] = 10;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 7.824999809265137) {
                                                    classes[0] = 6;
                                                    classes[1] = 2;
                                                } else {
                                                    classes[0] = 10;
                                                    classes[1] = 1;
                                                }
                                            }
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 3;
                                        }
                                    } else {
                                        if (features[2] <= 19.5) {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 11;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 32;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[0] <= 2.5) {
                                if (features[6] <= 1.0) {
                                    classes[0] = 6;
                                    classes[1] = 2;
                                } else {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 22;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 11.75) {
                                            classes[0] = 14;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 31.5) {
                                    if (features[5] <= 7.183349609375) {
                                        classes[0] = 7;
                                        classes[1] = 7;
                                    } else {
                                        if (features[6] <= 0.5) {
                                            if (features[5] <= 11.17704963684082) {
                                                classes[0] = 13;
                                                classes[1] = 4;
                                            } else {
                                                classes[0] = 2;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            if (features[5] <= 8.081250190734863) {
                                                if (features[5] <= 7.824999809265137) {
                                                    if (features[5] <= 7.745850086212158) {
                                                        classes[0] = 17;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[2] <= 29.349559783935547) {
                                                            classes[0] = 2;
                                                            classes[1] = 4;
                                                        } else {
                                                            classes[0] = 15;
                                                            classes[1] = 6;
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 49;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[5] <= 12.0) {
                                                    classes[0] = 7;
                                                    classes[1] = 8;
                                                } else {
                                                    if (features[5] <= 22.887500762939453) {
                                                        classes[0] = 17;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 9;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 5;
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 38.5) {
                            classes[0] = 43;
                            classes[1] = 0;
                        } else {
                            if (features[2] <= 39.5) {
                                classes[0] = 4;
                                classes[1] = 2;
                            } else {
                                if (features[0] <= 2.5) {
                                    if (features[5] <= 13.25) {
                                        classes[0] = 3;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 15;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 39;
                                    classes[1] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_27(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 149.035400390625) {
                    if (features[5] <= 13.25) {
                        if (features[2] <= 37.0) {
                            if (features[2] <= 28.5) {
                                classes[0] = 1;
                                classes[1] = 4;
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 4;
                        }
                    } else {
                        if (features[5] <= 26.125) {
                            if (features[3] <= 0.5) {
                                classes[0] = 0;
                                classes[1] = 19;
                            } else {
                                if (features[2] <= 25.5) {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                } else {
                                    if (features[2] <= 29.5) {
                                        classes[0] = 1;
                                        classes[1] = 7;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 71;
                        }
                    }
                } else {
                    if (features[5] <= 188.1020965576172) {
                        classes[0] = 6;
                        classes[1] = 4;
                    } else {
                        classes[0] = 0;
                        classes[1] = 11;
                    }
                }
            } else {
                if (features[5] <= 8.039600372314453) {
                    if (features[6] <= 1.5) {
                        if (features[5] <= 7.735400199890137) {
                            classes[0] = 2;
                            classes[1] = 5;
                        } else {
                            classes[0] = 1;
                            classes[1] = 26;
                        }
                    } else {
                        if (features[2] <= 21.5) {
                            classes[0] = 3;
                            classes[1] = 5;
                        } else {
                            classes[0] = 2;
                            classes[1] = 7;
                        }
                    }
                } else {
                    if (features[2] <= 5.5) {
                        if (features[2] <= 3.0) {
                            classes[0] = 5;
                            classes[1] = 8;
                        } else {
                            classes[0] = 0;
                            classes[1] = 10;
                        }
                    } else {
                        if (features[5] <= 24.808349609375) {
                            if (features[2] <= 26.5) {
                                if (features[3] <= 0.5) {
                                    classes[0] = 8;
                                    classes[1] = 2;
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 14.872900009155273) {
                                    if (features[3] <= 0.5) {
                                        classes[0] = 10;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 11;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[2] <= 29.849559783935547) {
                                        classes[0] = 2;
                                        classes[1] = 12;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 23;
                            classes[1] = 0;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 3.0) {
                    classes[0] = 0;
                    classes[1] = 29;
                } else {
                    classes[0] = 10;
                    classes[1] = 1;
                }
            } else {
                if (features[5] <= 26.318750381469727) {
                    if (features[4] <= 0.5) {
                        if (features[2] <= 23.75) {
                            if (features[2] <= 19.5) {
                                if (features[5] <= 8.104150772094727) {
                                    if (features[5] <= 7.845800399780273) {
                                        classes[0] = 10;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 16;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 40;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[5] <= 13.25) {
                                if (features[5] <= 9.491649627685547) {
                                    if (features[2] <= 29.349559783935547) {
                                        if (features[5] <= 7.824999809265137) {
                                            if (features[5] <= 7.699999809265137) {
                                                classes[0] = 12;
                                                classes[1] = 5;
                                            } else {
                                                classes[0] = 2;
                                                classes[1] = 6;
                                            }
                                        } else {
                                            if (features[2] <= 27.0) {
                                                classes[0] = 17;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 9;
                                                classes[1] = 1;
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 43.5) {
                                            if (features[5] <= 7.743750095367432) {
                                                classes[0] = 41;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 7.987500190734863) {
                                                    if (features[5] <= 7.910400390625) {
                                                        if (features[5] <= 7.835400104522705) {
                                                            classes[0] = 21;
                                                            classes[1] = 3;
                                                        } else {
                                                            classes[0] = 24;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        classes[0] = 3;
                                                        classes[1] = 2;
                                                    }
                                                } else {
                                                    classes[0] = 29;
                                                    classes[1] = 0;
                                                }
                                            }
                                        } else {
                                            if (features[5] <= 7.987500190734863) {
                                                classes[0] = 5;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 13;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 31.5) {
                                            classes[0] = 3;
                                            classes[1] = 9;
                                        } else {
                                            if (features[2] <= 34.5) {
                                                classes[0] = 4;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 11;
                                                classes[1] = 1;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[0] <= 2.5) {
                                    classes[0] = 23;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 16.950000762939453) {
                                        classes[0] = 10;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[5] <= 15.92085075378418) {
                            classes[0] = 5;
                            classes[1] = 7;
                        } else {
                            classes[0] = 12;
                            classes[1] = 0;
                        }
                    }
                } else {
                    if (features[5] <= 30.597900390625) {
                        if (features[5] <= 29.850000381469727) {
                            if (features[5] <= 27.135398864746094) {
                                if (features[2] <= 49.5) {
                                    classes[0] = 2;
                                    classes[1] = 9;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 9;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 3;
                            classes[1] = 9;
                        }
                    } else {
                        if (features[2] <= 31.5) {
                            if (features[3] <= 1.5) {
                                if (features[5] <= 123.25830078125) {
                                    if (features[5] <= 52.54999923706055) {
                                        if (features[5] <= 36.125) {
                                            classes[0] = 8;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 15;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[5] <= 61.54789733886719) {
                                            classes[0] = 3;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 11;
                                            classes[1] = 2;
                                        }
                                    }
                                } else {
                                    classes[0] = 11;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 14;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[2] <= 43.0) {
                                if (features[2] <= 36.5) {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 5;
                                }
                            } else {
                                if (features[3] <= 0.5) {
                                    classes[0] = 21;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 81.33749389648438) {
                                        classes[0] = 4;
                                        classes[1] = 4;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_28(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 28.856250762939453) {
                    if (features[2] <= 36.0) {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 23;
                        } else {
                            if (features[2] <= 25.0) {
                                classes[0] = 0;
                                classes[1] = 9;
                            } else {
                                classes[0] = 2;
                                classes[1] = 8;
                            }
                        }
                    } else {
                        if (features[5] <= 17.75) {
                            classes[0] = 2;
                            classes[1] = 4;
                        } else {
                            if (features[2] <= 46.5) {
                                classes[0] = 2;
                                classes[1] = 7;
                            } else {
                                classes[0] = 1;
                                classes[1] = 8;
                            }
                        }
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 74;
                    } else {
                        classes[0] = 1;
                        classes[1] = 8;
                    }
                }
            } else {
                if (features[6] <= 1.5) {
                    if (features[5] <= 13.935449600219727) {
                        if (features[5] <= 7.681250095367432) {
                            classes[0] = 4;
                            classes[1] = 5;
                        } else {
                            if (features[5] <= 7.768750190734863) {
                                classes[0] = 3;
                                classes[1] = 18;
                            } else {
                                classes[0] = 0;
                                classes[1] = 16;
                            }
                        }
                    } else {
                        if (features[5] <= 15.372900009155273) {
                            classes[0] = 11;
                            classes[1] = 1;
                        } else {
                            if (features[5] <= 20.808300018310547) {
                                classes[0] = 0;
                                classes[1] = 6;
                            } else {
                                classes[0] = 1;
                                classes[1] = 5;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 5.5) {
                        classes[0] = 2;
                        classes[1] = 9;
                    } else {
                        if (features[5] <= 20.799999237060547) {
                            if (features[2] <= 23.0) {
                                if (features[5] <= 8.293750762939453) {
                                    classes[0] = 3;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 9.53125) {
                                    if (features[5] <= 7.987500190734863) {
                                        classes[0] = 10;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    }
                                } else {
                                    if (features[2] <= 33.5) {
                                        classes[0] = 3;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 3;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 23;
                            classes[1] = 0;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 3.5) {
                classes[0] = 1;
                classes[1] = 12;
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[2] <= 16.5) {
                        if (features[5] <= 10.870849609375) {
                            classes[0] = 10;
                            classes[1] = 1;
                        } else {
                            classes[0] = 5;
                            classes[1] = 5;
                        }
                    } else {
                        if (features[5] <= 7.01039981842041) {
                            if (features[2] <= 28.349559783935547) {
                                classes[0] = 5;
                                classes[1] = 6;
                            } else {
                                classes[0] = 16;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[5] <= 7.785400390625) {
                                if (features[6] <= 0.5) {
                                    if (features[2] <= 26.0) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 16;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 70;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 7.875) {
                                    if (features[5] <= 7.8125) {
                                        classes[0] = 7;
                                        classes[1] = 4;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 2;
                                    }
                                } else {
                                    if (features[2] <= 28.5) {
                                        if (features[2] <= 19.5) {
                                            if (features[5] <= 8.481250762939453) {
                                                classes[0] = 4;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 14;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[5] <= 16.950000762939453) {
                                                classes[0] = 59;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 13.931249618530273) {
                                            if (features[5] <= 7.910400390625) {
                                                if (features[2] <= 29.849559783935547) {
                                                    classes[0] = 18;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 8;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[2] <= 32.5) {
                                                    if (features[5] <= 9.081250190734863) {
                                                        if (features[2] <= 29.849559783935547) {
                                                            classes[0] = 12;
                                                            classes[1] = 2;
                                                        } else {
                                                            classes[0] = 11;
                                                            classes[1] = 4;
                                                        }
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 7;
                                                    }
                                                } else {
                                                    if (features[5] <= 8.227100372314453) {
                                                        classes[0] = 11;
                                                        classes[1] = 3;
                                                    } else {
                                                        if (features[2] <= 49.0) {
                                                            classes[0] = 21;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 1;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[6] <= 1.5) {
                                                classes[0] = 12;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 32;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[3] <= 1.5) {
                        if (features[2] <= 50.5) {
                            if (features[5] <= 26.774999618530273) {
                                classes[0] = 5;
                                classes[1] = 12;
                            } else {
                                if (features[5] <= 29.100000381469727) {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 59.052101135253906) {
                                        if (features[5] <= 54.270851135253906) {
                                            if (features[5] <= 36.877098083496094) {
                                                if (features[5] <= 30.285400390625) {
                                                    classes[0] = 5;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 2;
                                                    classes[1] = 9;
                                                }
                                            } else {
                                                if (features[5] <= 51.0) {
                                                    classes[0] = 10;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 52.277099609375) {
                                                        classes[0] = 6;
                                                        classes[1] = 3;
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 4;
                                                    }
                                                }
                                            }
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 9;
                                        }
                                    } else {
                                        if (features[4] <= 0.5) {
                                            if (features[3] <= 0.5) {
                                                classes[0] = 12;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 7;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 4;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 63.0) {
                                if (features[4] <= 0.5) {
                                    classes[0] = 17;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 1;
                                }
                            } else {
                                classes[0] = 6;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        classes[0] = 20;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_29(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 7.0) {
                    classes[0] = 2;
                    classes[1] = 5;
                } else {
                    if (features[5] <= 28.856250762939453) {
                        if (features[2] <= 43.0) {
                            if (features[2] <= 27.5) {
                                if (features[5] <= 22.0) {
                                    classes[0] = 4;
                                    classes[1] = 10;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 16;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 30;
                            }
                        } else {
                            classes[0] = 3;
                            classes[1] = 8;
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 104;
                    }
                }
            } else {
                if (features[2] <= 30.5) {
                    if (features[6] <= 1.5) {
                        if (features[6] <= 0.5) {
                            if (features[5] <= 14.852049827575684) {
                                classes[0] = 7;
                                classes[1] = 1;
                            } else {
                                classes[0] = 1;
                                classes[1] = 10;
                            }
                        } else {
                            if (features[5] <= 7.814599990844727) {
                                classes[0] = 3;
                                classes[1] = 15;
                            } else {
                                classes[0] = 0;
                                classes[1] = 16;
                            }
                        }
                    } else {
                        if (features[5] <= 17.350000381469727) {
                            if (features[5] <= 11.46875) {
                                if (features[5] <= 7.889599800109863) {
                                    classes[0] = 5;
                                    classes[1] = 9;
                                } else {
                                    if (features[2] <= 22.5) {
                                        classes[0] = 5;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    }
                                }
                            } else {
                                classes[0] = 1;
                                classes[1] = 14;
                            }
                        } else {
                            classes[0] = 10;
                            classes[1] = 3;
                        }
                    }
                } else {
                    classes[0] = 13;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[2] <= 6.5) {
                if (features[3] <= 2.0) {
                    classes[0] = 0;
                    classes[1] = 22;
                } else {
                    classes[0] = 6;
                    classes[1] = 0;
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 35.5) {
                        if (features[2] <= 31.5) {
                            if (features[5] <= 28.860401153564453) {
                                classes[0] = 10;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 77.00834655761719) {
                                    if (features[2] <= 27.5) {
                                        classes[0] = 0;
                                        classes[1] = 7;
                                    } else {
                                        if (features[5] <= 41.29999923706055) {
                                            classes[0] = 3;
                                            classes[1] = 6;
                                        } else {
                                            classes[0] = 5;
                                            classes[1] = 3;
                                        }
                                    }
                                } else {
                                    if (features[2] <= 21.5) {
                                        classes[0] = 7;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 6;
                        }
                    } else {
                        if (features[5] <= 27.135398864746094) {
                            classes[0] = 6;
                            classes[1] = 6;
                        } else {
                            if (features[3] <= 0.5) {
                                classes[0] = 26;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 59.052101135253906) {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 12;
                                    classes[1] = 1;
                                }
                            }
                        }
                    }
                } else {
                    if (features[5] <= 51.697898864746094) {
                        if (features[2] <= 9.5) {
                            classes[0] = 6;
                            classes[1] = 3;
                        } else {
                            if (features[5] <= 15.79585075378418) {
                                if (features[5] <= 15.022899627685547) {
                                    if (features[5] <= 7.133349895477295) {
                                        classes[0] = 36;
                                        classes[1] = 0;
                                    } else {
                                        if (features[2] <= 38.5) {
                                            if (features[5] <= 7.227099895477295) {
                                                classes[0] = 4;
                                                classes[1] = 2;
                                            } else {
                                                if (features[2] <= 19.5) {
                                                    if (features[0] <= 2.5) {
                                                        classes[0] = 6;
                                                        classes[1] = 3;
                                                    } else {
                                                        if (features[2] <= 18.5) {
                                                            classes[0] = 14;
                                                            classes[1] = 3;
                                                        } else {
                                                            classes[0] = 18;
                                                            classes[1] = 0;
                                                        }
                                                    }
                                                } else {
                                                    if (features[5] <= 7.875) {
                                                        if (features[2] <= 30.5) {
                                                            if (features[5] <= 7.745850086212158) {
                                                                if (features[6] <= 0.5) {
                                                                    classes[0] = 12;
                                                                    classes[1] = 1;
                                                                } else {
                                                                    classes[0] = 20;
                                                                    classes[1] = 0;
                                                                }
                                                            } else {
                                                                if (features[5] <= 7.797900199890137) {
                                                                    if (features[2] <= 27.5) {
                                                                        classes[0] = 6;
                                                                        classes[1] = 2;
                                                                    } else {
                                                                        classes[0] = 16;
                                                                        classes[1] = 3;
                                                                    }
                                                                } else {
                                                                    classes[0] = 12;
                                                                    classes[1] = 0;
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 7;
                                                            classes[1] = 3;
                                                        }
                                                    } else {
                                                        if (features[6] <= 1.0) {
                                                            if (features[5] <= 10.793749809265137) {
                                                                classes[0] = 8;
                                                                classes[1] = 1;
                                                            } else {
                                                                classes[0] = 10;
                                                                classes[1] = 1;
                                                            }
                                                        } else {
                                                            if (features[5] <= 8.081250190734863) {
                                                                classes[0] = 66;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[5] <= 8.831250190734863) {
                                                                    classes[0] = 8;
                                                                    classes[1] = 2;
                                                                } else {
                                                                    if (features[2] <= 30.5) {
                                                                        classes[0] = 38;
                                                                        classes[1] = 0;
                                                                    } else {
                                                                        classes[0] = 10;
                                                                        classes[1] = 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 45.25) {
                                                if (features[2] <= 41.25) {
                                                    classes[0] = 7;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 6;
                                                    classes[1] = 5;
                                                }
                                            } else {
                                                if (features[2] <= 55.5) {
                                                    classes[0] = 13;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 10;
                                                    classes[1] = 1;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 59;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[5] <= 63.02290344238281) {
                            classes[0] = 3;
                            classes[1] = 4;
                        } else {
                            classes[0] = 6;
                            classes[1] = 0;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_30(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[2] <= 25.0) {
                        classes[0] = 0;
                        classes[1] = 16;
                    } else {
                        if (features[5] <= 25.964599609375) {
                            if (features[2] <= 28.5) {
                                classes[0] = 2;
                                classes[1] = 8;
                            } else {
                                if (features[5] <= 14.375) {
                                    if (features[2] <= 37.0) {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 13;
                                }
                            }
                        } else {
                            classes[0] = 3;
                            classes[1] = 5;
                        }
                    }
                } else {
                    if (features[5] <= 149.035400390625) {
                        classes[0] = 0;
                        classes[1] = 86;
                    } else {
                        if (features[5] <= 188.1020965576172) {
                            classes[0] = 2;
                            classes[1] = 4;
                        } else {
                            classes[0] = 0;
                            classes[1] = 12;
                        }
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[5] <= 7.522900104522705) {
                        classes[0] = 0;
                        classes[1] = 9;
                    } else {
                        if (features[6] <= 1.5) {
                            if (features[6] <= 0.5) {
                                if (features[2] <= 17.5) {
                                    classes[0] = 2;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 2;
                                }
                            } else {
                                if (features[5] <= 7.814599990844727) {
                                    classes[0] = 4;
                                    classes[1] = 15;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 9;
                                }
                            }
                        } else {
                            if (features[5] <= 10.824999809265137) {
                                if (features[5] <= 9.706249237060547) {
                                    if (features[2] <= 27.5) {
                                        if (features[2] <= 20.5) {
                                            classes[0] = 2;
                                            classes[1] = 3;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 6;
                                        }
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 3;
                                    }
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 17.25) {
                                    if (features[5] <= 13.4375) {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 13;
                                    }
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 1;
                                }
                            }
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 10;
                        classes[1] = 0;
                    } else {
                        classes[0] = 8;
                        classes[1] = 5;
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[2] <= 49.5) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 10;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 27.135398864746094) {
                            classes[0] = 0;
                            classes[1] = 12;
                        } else {
                            if (features[5] <= 52.277099609375) {
                                if (features[5] <= 37.0) {
                                    if (features[6] <= 1.0) {
                                        classes[0] = 6;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 7;
                                    }
                                } else {
                                    classes[0] = 11;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[6] <= 0.5) {
                                    if (features[2] <= 31.5) {
                                        classes[0] = 2;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    }
                                } else {
                                    if (features[5] <= 63.88749694824219) {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    } else {
                                        if (features[4] <= 0.5) {
                                            classes[0] = 5;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 57.0) {
                        classes[0] = 9;
                        classes[1] = 2;
                    } else {
                        classes[0] = 18;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[2] <= 3.5) {
                    classes[0] = 3;
                    classes[1] = 8;
                } else {
                    if (features[2] <= 32.5) {
                        if (features[2] <= 30.75) {
                            if (features[6] <= 0.5) {
                                if (features[2] <= 22.5) {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                } else {
                                    if (features[5] <= 15.047900199890137) {
                                        if (features[2] <= 28.75) {
                                            classes[0] = 6;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 7.5625) {
                                                classes[0] = 14;
                                                classes[1] = 3;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 2;
                                            }
                                        }
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 3;
                                    }
                                }
                            } else {
                                if (features[5] <= 51.697898864746094) {
                                    if (features[2] <= 9.5) {
                                        classes[0] = 7;
                                        classes[1] = 3;
                                    } else {
                                        if (features[5] <= 7.745850086212158) {
                                            if (features[5] <= 3.2479000091552734) {
                                                classes[0] = 10;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 43;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[5] <= 7.797900199890137) {
                                                if (features[5] <= 7.762499809265137) {
                                                    classes[0] = 9;
                                                    classes[1] = 1;
                                                } else {
                                                    if (features[2] <= 24.5) {
                                                        classes[0] = 8;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 3;
                                                        classes[1] = 5;
                                                    }
                                                }
                                            } else {
                                                if (features[5] <= 7.910400390625) {
                                                    classes[0] = 41;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 8.831250190734863) {
                                                        if (features[2] <= 20.5) {
                                                            classes[0] = 6;
                                                            classes[1] = 5;
                                                        } else {
                                                            if (features[2] <= 26.5) {
                                                                classes[0] = 14;
                                                                classes[1] = 0;
                                                            } else {
                                                                classes[0] = 19;
                                                                classes[1] = 5;
                                                            }
                                                        }
                                                    } else {
                                                        if (features[2] <= 28.75) {
                                                            if (features[2] <= 19.5) {
                                                                if (features[2] <= 17.5) {
                                                                    classes[0] = 8;
                                                                    classes[1] = 0;
                                                                } else {
                                                                    classes[0] = 4;
                                                                    classes[1] = 1;
                                                                }
                                                            } else {
                                                                classes[0] = 42;
                                                                classes[1] = 0;
                                                            }
                                                        } else {
                                                            if (features[5] <= 13.75) {
                                                                classes[0] = 6;
                                                                classes[1] = 3;
                                                            } else {
                                                                if (features[5] <= 15.800000190734863) {
                                                                    classes[0] = 10;
                                                                    classes[1] = 0;
                                                                } else {
                                                                    classes[0] = 7;
                                                                    classes[1] = 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[3] <= 1.0) {
                                        classes[0] = 8;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 14.425000190734863) {
                                classes[0] = 9;
                                classes[1] = 9;
                            } else {
                                classes[0] = 5;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        if (features[2] <= 41.5) {
                            classes[0] = 62;
                            classes[1] = 0;
                        } else {
                            if (features[5] <= 7.837500095367432) {
                                classes[0] = 18;
                                classes[1] = 0;
                            } else {
                                if (features[5] <= 11.425000190734863) {
                                    classes[0] = 4;
                                    classes[1] = 2;
                                } else {
                                    if (features[5] <= 13.25) {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    } else {
                                        classes[0] = 13;
                                        classes[1] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_31(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 26.125) {
                    if (features[5] <= 25.0) {
                        if (features[2] <= 47.5) {
                            classes[0] = 0;
                            classes[1] = 40;
                        } else {
                            classes[0] = 1;
                            classes[1] = 6;
                        }
                    } else {
                        classes[0] = 3;
                        classes[1] = 5;
                    }
                } else {
                    if (features[2] <= 11.0) {
                        classes[0] = 1;
                        classes[1] = 6;
                    } else {
                        classes[0] = 0;
                        classes[1] = 97;
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[2] <= 36.5) {
                        if (features[3] <= 0.5) {
                            if (features[5] <= 14.852049827575684) {
                                if (features[2] <= 18.5) {
                                    if (features[2] <= 16.5) {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 4;
                                    }
                                } else {
                                    if (features[5] <= 8.008350372314453) {
                                        if (features[2] <= 26.349559783935547) {
                                            classes[0] = 0;
                                            classes[1] = 5;
                                        } else {
                                            if (features[5] <= 7.768750190734863) {
                                                if (features[5] <= 7.743750095367432) {
                                                    classes[0] = 1;
                                                    classes[1] = 5;
                                                } else {
                                                    classes[0] = 1;
                                                    classes[1] = 4;
                                                }
                                            } else {
                                                classes[0] = 1;
                                                classes[1] = 6;
                                            }
                                        }
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 2;
                                    }
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[2] <= 29.349559783935547) {
                                if (features[2] <= 21.5) {
                                    classes[0] = 8;
                                    classes[1] = 9;
                                } else {
                                    classes[0] = 12;
                                    classes[1] = 1;
                                }
                            } else {
                                if (features[6] <= 1.5) {
                                    classes[0] = 3;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                }
                            }
                        }
                    } else {
                        classes[0] = 9;
                        classes[1] = 0;
                    }
                } else {
                    classes[0] = 16;
                    classes[1] = 0;
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[2] <= 27.5) {
                    if (features[2] <= 24.5) {
                        classes[0] = 6;
                        classes[1] = 8;
                    } else {
                        classes[0] = 0;
                        classes[1] = 9;
                    }
                } else {
                    if (features[2] <= 51.5) {
                        if (features[5] <= 27.135398864746094) {
                            if (features[5] <= 25.9375) {
                                classes[0] = 7;
                                classes[1] = 0;
                            } else {
                                classes[0] = 1;
                                classes[1] = 13;
                            }
                        } else {
                            if (features[5] <= 29.850000381469727) {
                                classes[0] = 11;
                                classes[1] = 0;
                            } else {
                                if (features[6] <= 0.5) {
                                    classes[0] = 4;
                                    classes[1] = 10;
                                } else {
                                    if (features[5] <= 41.29999923706055) {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    } else {
                                        if (features[5] <= 86.73750305175781) {
                                            if (features[2] <= 39.5) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 11;
                                                classes[1] = 2;
                                            }
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 4;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 64.5) {
                            classes[0] = 11;
                            classes[1] = 0;
                        } else {
                            classes[0] = 5;
                            classes[1] = 2;
                        }
                    }
                }
            } else {
                if (features[2] <= 3.5) {
                    if (features[3] <= 2.0) {
                        classes[0] = 0;
                        classes[1] = 10;
                    } else {
                        classes[0] = 11;
                        classes[1] = 5;
                    }
                } else {
                    if (features[6] <= 0.5) {
                        if (features[4] <= 0.5) {
                            if (features[2] <= 29.349559783935547) {
                                classes[0] = 6;
                                classes[1] = 6;
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    if (features[5] <= 7.227099895477295) {
                                        classes[0] = 6;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 7.5625) {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    classes[0] = 14;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            classes[0] = 2;
                            classes[1] = 7;
                        }
                    } else {
                        if (features[5] <= 51.697898864746094) {
                            if (features[5] <= 7.910400390625) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 38;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 29.349559783935547) {
                                        if (features[2] <= 26.5) {
                                            if (features[5] <= 7.785400390625) {
                                                classes[0] = 5;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 4;
                                        }
                                    } else {
                                        if (features[5] <= 7.741650104522705) {
                                            classes[0] = 37;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 7.875) {
                                                if (features[2] <= 31.5) {
                                                    classes[0] = 14;
                                                    classes[1] = 1;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 1;
                                                }
                                            } else {
                                                classes[0] = 18;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[5] <= 7.987500190734863) {
                                    classes[0] = 7;
                                    classes[1] = 7;
                                } else {
                                    if (features[5] <= 13.25) {
                                        if (features[5] <= 8.658349990844727) {
                                            if (features[2] <= 19.5) {
                                                classes[0] = 4;
                                                classes[1] = 4;
                                            } else {
                                                classes[0] = 39;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[2] <= 28.5) {
                                                if (features[5] <= 11.316650390625) {
                                                    if (features[5] <= 10.335399627685547) {
                                                        if (features[2] <= 22.5) {
                                                            classes[0] = 12;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 7;
                                                            classes[1] = 3;
                                                        }
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 4;
                                                    }
                                                } else {
                                                    classes[0] = 20;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[2] <= 32.0) {
                                                    classes[0] = 7;
                                                    classes[1] = 7;
                                                } else {
                                                    if (features[2] <= 40.0) {
                                                        classes[0] = 7;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 10;
                                                        classes[1] = 5;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[2] <= 9.5) {
                                            classes[0] = 12;
                                            classes[1] = 2;
                                        } else {
                                            if (features[3] <= 0.5) {
                                                classes[0] = 38;
                                                classes[1] = 0;
                                            } else {
                                                if (features[4] <= 0.5) {
                                                    if (features[2] <= 33.0) {
                                                        classes[0] = 9;
                                                        classes[1] = 3;
                                                    } else {
                                                        classes[0] = 10;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    classes[0] = 24;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 63.02290344238281) {
                                classes[0] = 5;
                                classes[1] = 7;
                            } else {
                                classes[0] = 9;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_32(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 13.39585018157959) {
                    if (features[5] <= 12.824999809265137) {
                        classes[0] = 2;
                        classes[1] = 16;
                    } else {
                        classes[0] = 4;
                        classes[1] = 6;
                    }
                } else {
                    if (features[2] <= 6.0) {
                        classes[0] = 1;
                        classes[1] = 11;
                    } else {
                        classes[0] = 0;
                        classes[1] = 132;
                    }
                }
            } else {
                if (features[5] <= 23.254150390625) {
                    if (features[5] <= 15.372900009155273) {
                        if (features[2] <= 20.0) {
                            if (features[5] <= 7.866700172424316) {
                                classes[0] = 4;
                                classes[1] = 3;
                            } else {
                                if (features[5] <= 12.852100372314453) {
                                    classes[0] = 0;
                                    classes[1] = 11;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 3;
                                }
                            }
                        } else {
                            if (features[5] <= 7.589600086212158) {
                                classes[0] = 2;
                                classes[1] = 6;
                            } else {
                                if (features[2] <= 25.5) {
                                    classes[0] = 13;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    } else {
                                        if (features[5] <= 8.672900199890137) {
                                            if (features[5] <= 7.80210018157959) {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 6;
                                                classes[1] = 1;
                                            }
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 3;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 27.849559783935547) {
                            if (features[5] <= 18.629150390625) {
                                classes[0] = 4;
                                classes[1] = 2;
                            } else {
                                classes[0] = 2;
                                classes[1] = 5;
                            }
                        } else {
                            if (features[4] <= 0.5) {
                                classes[0] = 0;
                                classes[1] = 9;
                            } else {
                                classes[0] = 2;
                                classes[1] = 3;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 31.331249237060547) {
                        classes[0] = 19;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 37.03125) {
                            classes[0] = 4;
                            classes[1] = 3;
                        } else {
                            classes[0] = 9;
                            classes[1] = 0;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 9.5) {
                if (features[3] <= 2.5) {
                    classes[0] = 0;
                    classes[1] = 17;
                } else {
                    classes[0] = 10;
                    classes[1] = 0;
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[5] <= 15.79585075378418) {
                        if (features[5] <= 15.172900199890137) {
                            if (features[2] <= 61.5) {
                                if (features[2] <= 32.5) {
                                    if (features[2] <= 30.75) {
                                        if (features[5] <= 7.183349609375) {
                                            if (features[2] <= 28.0) {
                                                classes[0] = 6;
                                                classes[1] = 8;
                                            } else {
                                                classes[0] = 18;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[2] <= 20.25) {
                                                if (features[2] <= 18.5) {
                                                    if (features[2] <= 16.5) {
                                                        classes[0] = 9;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 13;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    if (features[5] <= 8.104150772094727) {
                                                        classes[0] = 9;
                                                        classes[1] = 6;
                                                    } else {
                                                        classes[0] = 9;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            } else {
                                                if (features[6] <= 1.5) {
                                                    if (features[5] <= 7.745850086212158) {
                                                        if (features[6] <= 0.5) {
                                                            classes[0] = 13;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 10;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        if (features[5] <= 8.10414981842041) {
                                                            classes[0] = 9;
                                                            classes[1] = 4;
                                                        } else {
                                                            classes[0] = 7;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                } else {
                                                    if (features[5] <= 7.824999809265137) {
                                                        if (features[5] <= 7.712500095367432) {
                                                            classes[0] = 14;
                                                            classes[1] = 0;
                                                        } else {
                                                            if (features[2] <= 26.5) {
                                                                classes[0] = 6;
                                                                classes[1] = 1;
                                                            } else {
                                                                classes[0] = 5;
                                                                classes[1] = 2;
                                                            }
                                                        }
                                                    } else {
                                                        if (features[2] <= 29.849559783935547) {
                                                            if (features[5] <= 8.081250190734863) {
                                                                classes[0] = 55;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[5] <= 9.112500190734863) {
                                                                    classes[0] = 6;
                                                                    classes[1] = 1;
                                                                } else {
                                                                    classes[0] = 23;
                                                                    classes[1] = 0;
                                                                }
                                                            }
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 4;
                                    }
                                } else {
                                    if (features[2] <= 43.5) {
                                        classes[0] = 52;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 7.987500190734863) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 14;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 7;
                                classes[1] = 3;
                            }
                        } else {
                            classes[0] = 6;
                            classes[1] = 3;
                        }
                    } else {
                        if (features[2] <= 31.5) {
                            classes[0] = 48;
                            classes[1] = 0;
                        } else {
                            if (features[2] <= 36.75) {
                                classes[0] = 6;
                                classes[1] = 1;
                            } else {
                                classes[0] = 13;
                                classes[1] = 0;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 27.135398864746094) {
                        if (features[2] <= 43.5) {
                            classes[0] = 2;
                            classes[1] = 6;
                        } else {
                            classes[0] = 5;
                            classes[1] = 8;
                        }
                    } else {
                        if (features[3] <= 1.5) {
                            if (features[0] <= 2.5) {
                                if (features[0] <= 1.5) {
                                    if (features[5] <= 37.0) {
                                        if (features[5] <= 29.850000381469727) {
                                            classes[0] = 7;
                                            classes[1] = 1;
                                        } else {
                                            if (features[2] <= 42.5) {
                                                classes[0] = 4;
                                                classes[1] = 10;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 3;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 71.66459655761719) {
                                            if (features[2] <= 47.5) {
                                                classes[0] = 17;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 8;
                                                classes[1] = 3;
                                            }
                                        } else {
                                            if (features[5] <= 98.2125015258789) {
                                                classes[0] = 4;
                                                classes[1] = 8;
                                            } else {
                                                if (features[2] <= 25.5) {
                                                    classes[0] = 5;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 10;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 0;
                                }
                            } else {
                                classes[0] = 2;
                                classes[1] = 5;
                            }
                        } else {
                            classes[0] = 12;
                            classes[1] = 0;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_33(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 10.5) {
                    classes[0] = 3;
                    classes[1] = 7;
                } else {
                    if (features[5] <= 28.856250762939453) {
                        if (features[2] <= 37.0) {
                            if (features[2] <= 27.5) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 0;
                                    classes[1] = 17;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 8;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 28;
                            }
                        } else {
                            if (features[5] <= 14.625) {
                                classes[0] = 3;
                                classes[1] = 4;
                            } else {
                                if (features[5] <= 25.964599609375) {
                                    classes[0] = 0;
                                    classes[1] = 12;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 12;
                                }
                            }
                        }
                    } else {
                        if (features[4] <= 1.5) {
                            classes[0] = 0;
                            classes[1] = 67;
                        } else {
                            if (features[5] <= 115.60000610351562) {
                                classes[0] = 0;
                                classes[1] = 10;
                            } else {
                                classes[0] = 1;
                                classes[1] = 5;
                            }
                        }
                    }
                }
            } else {
                if (features[5] <= 23.700000762939453) {
                    if (features[2] <= 20.0) {
                        if (features[5] <= 7.814599990844727) {
                            classes[0] = 1;
                            classes[1] = 5;
                        } else {
                            classes[0] = 0;
                            classes[1] = 16;
                        }
                    } else {
                        if (features[5] <= 7.887499809265137) {
                            if (features[5] <= 7.743750095367432) {
                                classes[0] = 1;
                                classes[1] = 9;
                            } else {
                                if (features[5] <= 7.762499809265137) {
                                    classes[0] = 5;
                                    classes[1] = 15;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        } else {
                            if (features[5] <= 15.372900009155273) {
                                if (features[4] <= 0.5) {
                                    if (features[5] <= 8.672900199890137) {
                                        classes[0] = 10;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 6;
                                }
                            } else {
                                if (features[2] <= 30.349559783935547) {
                                    classes[0] = 1;
                                    classes[1] = 12;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 6;
                                }
                            }
                        }
                    }
                } else {
                    if (features[4] <= 3.0) {
                        classes[0] = 21;
                        classes[1] = 0;
                    } else {
                        classes[0] = 6;
                        classes[1] = 1;
                    }
                }
            }
        } else {
            if (features[2] <= 13.0) {
                if (features[3] <= 2.0) {
                    if (features[2] <= 5.0) {
                        classes[0] = 0;
                        classes[1] = 15;
                    } else {
                        classes[0] = 1;
                        classes[1] = 6;
                    }
                } else {
                    if (features[5] <= 30.200000762939453) {
                        classes[0] = 7;
                        classes[1] = 0;
                    } else {
                        classes[0] = 7;
                        classes[1] = 4;
                    }
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[5] <= 7.745850086212158) {
                        if (features[2] <= 27.75) {
                            if (features[5] <= 7.23960018157959) {
                                if (features[2] <= 19.5) {
                                    classes[0] = 8;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 20;
                                classes[1] = 0;
                            }
                        } else {
                            classes[0] = 54;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[2] <= 29.349559783935547) {
                                classes[0] = 2;
                                classes[1] = 4;
                            } else {
                                classes[0] = 8;
                                classes[1] = 2;
                            }
                        } else {
                            if (features[5] <= 13.25) {
                                if (features[0] <= 2.5) {
                                    if (features[2] <= 20.0) {
                                        classes[0] = 6;
                                        classes[1] = 4;
                                    } else {
                                        if (features[2] <= 29.349559783935547) {
                                            classes[0] = 11;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 12.762499809265137) {
                                                classes[0] = 8;
                                                classes[1] = 1;
                                            } else {
                                                if (features[2] <= 35.0) {
                                                    classes[0] = 5;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 7;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 8.135400772094727) {
                                        if (features[5] <= 7.910400390625) {
                                            if (features[5] <= 7.8125) {
                                                if (features[2] <= 29.349559783935547) {
                                                    if (features[2] <= 24.5) {
                                                        classes[0] = 8;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 3;
                                                        classes[1] = 4;
                                                    }
                                                } else {
                                                    classes[0] = 23;
                                                    classes[1] = 3;
                                                }
                                            } else {
                                                if (features[2] <= 31.0) {
                                                    classes[0] = 39;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 1;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 29.349559783935547) {
                                                classes[0] = 12;
                                                classes[1] = 1;
                                            } else {
                                                if (features[2] <= 33.0) {
                                                    classes[0] = 13;
                                                    classes[1] = 8;
                                                } else {
                                                    if (features[2] <= 43.5) {
                                                        classes[0] = 6;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 37;
                                        classes[1] = 0;
                                    }
                                }
                            } else {
                                if (features[2] <= 29.849559783935547) {
                                    if (features[5] <= 22.887500762939453) {
                                        classes[0] = 16;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 39;
                                    classes[1] = 0;
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 53.0) {
                        if (features[5] <= 30.597900390625) {
                            if (features[6] <= 1.0) {
                                classes[0] = 6;
                                classes[1] = 4;
                            } else {
                                if (features[2] <= 31.849559783935547) {
                                    classes[0] = 3;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 14;
                                }
                            }
                        } else {
                            if (features[5] <= 86.28959655761719) {
                                if (features[2] <= 47.5) {
                                    if (features[3] <= 0.5) {
                                        if (features[5] <= 54.247901916503906) {
                                            if (features[5] <= 37.0) {
                                                classes[0] = 3;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            classes[0] = 3;
                                            classes[1] = 5;
                                        }
                                    } else {
                                        if (features[5] <= 52.82709884643555) {
                                            classes[0] = 5;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 20;
                                            classes[1] = 0;
                                        }
                                    }
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[5] <= 122.26664733886719) {
                                    classes[0] = 2;
                                    classes[1] = 11;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                }
                            }
                        }
                    } else {
                        classes[0] = 25;
                        classes[1] = 0;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_34(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 29.356250762939453) {
                    if (features[2] <= 37.0) {
                        if (features[3] <= 0.5) {
                            classes[0] = 0;
                            classes[1] = 35;
                        } else {
                            if (features[2] <= 25.0) {
                                classes[0] = 0;
                                classes[1] = 11;
                            } else {
                                classes[0] = 3;
                                classes[1] = 5;
                            }
                        }
                    } else {
                        if (features[2] <= 44.5) {
                            classes[0] = 3;
                            classes[1] = 3;
                        } else {
                            classes[0] = 2;
                            classes[1] = 8;
                        }
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 88;
                    } else {
                        classes[0] = 1;
                        classes[1] = 14;
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[2] <= 17.5) {
                        if (features[2] <= 14.75) {
                            if (features[2] <= 6.5) {
                                classes[0] = 1;
                                classes[1] = 9;
                            } else {
                                classes[0] = 5;
                                classes[1] = 1;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 9;
                        }
                    } else {
                        if (features[2] <= 25.5) {
                            if (features[3] <= 0.5) {
                                if (features[2] <= 21.5) {
                                    classes[0] = 14;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 7;
                                classes[1] = 0;
                            }
                        } else {
                            if (features[5] <= 7.987500190734863) {
                                if (features[6] <= 1.5) {
                                    classes[0] = 4;
                                    classes[1] = 18;
                                } else {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                }
                            } else {
                                if (features[5] <= 14.872900009155273) {
                                    classes[0] = 14;
                                    classes[1] = 6;
                                } else {
                                    if (features[4] <= 0.5) {
                                        classes[0] = 3;
                                        classes[1] = 13;
                                    } else {
                                        classes[0] = 4;
                                        classes[1] = 2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (features[5] <= 32.881248474121094) {
                        if (features[5] <= 30.200000762939453) {
                            classes[0] = 17;
                            classes[1] = 1;
                        } else {
                            classes[0] = 5;
                            classes[1] = 2;
                        }
                    } else {
                        classes[0] = 16;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[2] <= 53.0) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 8;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 30.597900390625) {
                            if (features[5] <= 28.725000381469727) {
                                if (features[2] <= 34.5) {
                                    classes[0] = 3;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 2;
                                    classes[1] = 10;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 10;
                            }
                        } else {
                            if (features[3] <= 0.5) {
                                if (features[4] <= 0.5) {
                                    if (features[5] <= 43.349998474121094) {
                                        classes[0] = 4;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 12;
                                        classes[1] = 2;
                                    }
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 4;
                                }
                            } else {
                                if (features[5] <= 90.53959655761719) {
                                    if (features[5] <= 61.79999923706055) {
                                        classes[0] = 5;
                                        classes[1] = 8;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        }
                    }
                } else {
                    if (features[2] <= 60.5) {
                        classes[0] = 7;
                        classes[1] = 2;
                    } else {
                        classes[0] = 15;
                        classes[1] = 1;
                    }
                }
            } else {
                if (features[2] <= 13.0) {
                    if (features[3] <= 2.0) {
                        if (features[2] <= 5.0) {
                            classes[0] = 0;
                            classes[1] = 15;
                        } else {
                            classes[0] = 1;
                            classes[1] = 4;
                        }
                    } else {
                        classes[0] = 11;
                        classes[1] = 0;
                    }
                } else {
                    if (features[5] <= 51.697898864746094) {
                        if (features[5] <= 13.25) {
                            if (features[5] <= 12.762499809265137) {
                                if (features[2] <= 29.349559783935547) {
                                    if (features[6] <= 0.5) {
                                        classes[0] = 7;
                                        classes[1] = 6;
                                    } else {
                                        if (features[5] <= 7.087500095367432) {
                                            classes[0] = 7;
                                            classes[1] = 3;
                                        } else {
                                            if (features[2] <= 20.5) {
                                                if (features[5] <= 7.910400390625) {
                                                    classes[0] = 13;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 8.356250762939453) {
                                                        classes[0] = 5;
                                                        classes[1] = 6;
                                                    } else {
                                                        if (features[2] <= 18.5) {
                                                            classes[0] = 7;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 1;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (features[5] <= 7.824999809265137) {
                                                    if (features[2] <= 23.0) {
                                                        classes[0] = 10;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 11;
                                                        classes[1] = 3;
                                                    }
                                                } else {
                                                    classes[0] = 45;
                                                    classes[1] = 0;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (features[5] <= 7.73960018157959) {
                                        classes[0] = 48;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 7.875) {
                                            if (features[6] <= 1.5) {
                                                classes[0] = 15;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 3;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            if (features[2] <= 38.5) {
                                                classes[0] = 50;
                                                classes[1] = 0;
                                            } else {
                                                classes[0] = 13;
                                                classes[1] = 3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 28.849559783935547) {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 5;
                                }
                            }
                        } else {
                            if (features[6] <= 1.5) {
                                if (features[5] <= 17.143749237060547) {
                                    classes[0] = 11;
                                    classes[1] = 0;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 2;
                                }
                            } else {
                                classes[0] = 77;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[5] <= 63.02290344238281) {
                            classes[0] = 2;
                            classes[1] = 5;
                        } else {
                            classes[0] = 9;
                            classes[1] = 0;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_35(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 6.0) {
                    classes[0] = 2;
                    classes[1] = 4;
                } else {
                    if (features[2] <= 49.5) {
                        if (features[5] <= 26.125) {
                            if (features[5] <= 25.964599609375) {
                                if (features[2] <= 36.0) {
                                    classes[0] = 0;
                                    classes[1] = 27;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 10;
                                }
                            } else {
                                classes[0] = 1;
                                classes[1] = 8;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 79;
                        }
                    } else {
                        if (features[5] <= 40.095848083496094) {
                            classes[0] = 3;
                            classes[1] = 10;
                        } else {
                            classes[0] = 0;
                            classes[1] = 12;
                        }
                    }
                }
            } else {
                if (features[5] <= 23.350000381469727) {
                    if (features[5] <= 15.620849609375) {
                        if (features[5] <= 7.902100086212158) {
                            if (features[6] <= 1.5) {
                                if (features[5] <= 7.768750190734863) {
                                    classes[0] = 6;
                                    classes[1] = 13;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 8;
                                }
                            } else {
                                classes[0] = 8;
                                classes[1] = 7;
                            }
                        } else {
                            if (features[2] <= 19.0) {
                                classes[0] = 4;
                                classes[1] = 9;
                            } else {
                                if (features[2] <= 26.0) {
                                    classes[0] = 13;
                                    classes[1] = 0;
                                } else {
                                    if (features[3] <= 0.5) {
                                        classes[0] = 6;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 8;
                                        classes[1] = 2;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 29.349559783935547) {
                            if (features[2] <= 6.5) {
                                classes[0] = 0;
                                classes[1] = 8;
                            } else {
                                classes[0] = 6;
                                classes[1] = 4;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 12;
                        }
                    }
                } else {
                    if (features[2] <= 13.0) {
                        classes[0] = 6;
                        classes[1] = 2;
                    } else {
                        classes[0] = 25;
                        classes[1] = 0;
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[5] <= 152.50625610351562) {
                    if (features[5] <= 26.143749237060547) {
                        classes[0] = 10;
                        classes[1] = 0;
                    } else {
                        if (features[5] <= 30.597900390625) {
                            if (features[5] <= 29.100000381469727) {
                                if (features[2] <= 35.5) {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 11;
                                }
                            } else {
                                if (features[5] <= 30.25) {
                                    classes[0] = 1;
                                    classes[1] = 9;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                }
                            }
                        } else {
                            if (features[2] <= 57.0) {
                                if (features[4] <= 0.5) {
                                    if (features[2] <= 47.5) {
                                        if (features[2] <= 41.0) {
                                            if (features[3] <= 0.5) {
                                                classes[0] = 8;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            classes[0] = 13;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 10;
                                    }
                                } else {
                                    if (features[4] <= 1.5) {
                                        classes[0] = 3;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 0;
                                        classes[1] = 9;
                                    }
                                }
                            } else {
                                classes[0] = 13;
                                classes[1] = 0;
                            }
                        }
                    }
                } else {
                    classes[0] = 13;
                    classes[1] = 1;
                }
            } else {
                if (features[2] <= 11.5) {
                    if (features[3] <= 2.0) {
                        classes[0] = 0;
                        classes[1] = 13;
                    } else {
                        classes[0] = 9;
                        classes[1] = 0;
                    }
                } else {
                    if (features[2] <= 32.25) {
                        if (features[2] <= 30.5) {
                            if (features[6] <= 0.5) {
                                if (features[2] <= 22.75) {
                                    classes[0] = 6;
                                    classes[1] = 5;
                                } else {
                                    if (features[5] <= 7.5625) {
                                        if (features[5] <= 7.227099895477295) {
                                            classes[0] = 5;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 10;
                                            classes[1] = 1;
                                        }
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 3;
                                    }
                                }
                            } else {
                                if (features[4] <= 0.5) {
                                    if (features[5] <= 7.741650104522705) {
                                        if (features[5] <= 3.522900104522705) {
                                            classes[0] = 6;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 23;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[5] <= 7.797900199890137) {
                                            if (features[2] <= 25.5) {
                                                classes[0] = 11;
                                                classes[1] = 2;
                                            } else {
                                                classes[0] = 14;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            if (features[5] <= 7.910400390625) {
                                                classes[0] = 39;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 9.672900199890137) {
                                                    if (features[2] <= 29.349559783935547) {
                                                        if (features[2] <= 25.25) {
                                                            if (features[5] <= 8.104150772094727) {
                                                                if (features[2] <= 20.5) {
                                                                    classes[0] = 4;
                                                                    classes[1] = 4;
                                                                } else {
                                                                    classes[0] = 6;
                                                                    classes[1] = 0;
                                                                }
                                                            } else {
                                                                classes[0] = 14;
                                                                classes[1] = 0;
                                                            }
                                                        } else {
                                                            classes[0] = 8;
                                                            classes[1] = 5;
                                                        }
                                                    } else {
                                                        classes[0] = 12;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    if (features[5] <= 22.887500762939453) {
                                                        if (features[0] <= 2.5) {
                                                            if (features[2] <= 28.5) {
                                                                if (features[2] <= 20.0) {
                                                                    classes[0] = 6;
                                                                    classes[1] = 1;
                                                                } else {
                                                                    classes[0] = 17;
                                                                    classes[1] = 0;
                                                                }
                                                            } else {
                                                                classes[0] = 5;
                                                                classes[1] = 1;
                                                            }
                                                        } else {
                                                            classes[0] = 21;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        if (features[2] <= 28.349559783935547) {
                                                            classes[0] = 9;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 18;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            if (features[5] <= 11.75) {
                                classes[0] = 11;
                                classes[1] = 4;
                            } else {
                                classes[0] = 5;
                                classes[1] = 5;
                            }
                        }
                    } else {
                        if (features[2] <= 60.5) {
                            if (features[5] <= 7.987500190734863) {
                                if (features[2] <= 43.0) {
                                    if (features[2] <= 38.5) {
                                        classes[0] = 22;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 5;
                                    classes[1] = 3;
                                }
                            } else {
                                if (features[2] <= 34.5) {
                                    if (features[2] <= 33.5) {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    }
                                } else {
                                    classes[0] = 52;
                                    classes[1] = 0;
                                }
                            }
                        } else {
                            classes[0] = 4;
                            classes[1] = 2;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_36(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 29.356250762939453) {
                    if (features[4] <= 0.5) {
                        if (features[2] <= 27.5) {
                            classes[0] = 4;
                            classes[1] = 9;
                        } else {
                            if (features[5] <= 25.964599609375) {
                                classes[0] = 0;
                                classes[1] = 24;
                            } else {
                                classes[0] = 2;
                                classes[1] = 10;
                            }
                        }
                    } else {
                        classes[0] = 0;
                        classes[1] = 22;
                    }
                } else {
                    if (features[2] <= 16.5) {
                        classes[0] = 1;
                        classes[1] = 7;
                    } else {
                        classes[0] = 0;
                        classes[1] = 95;
                    }
                }
            } else {
                if (features[3] <= 2.5) {
                    if (features[2] <= 29.849559783935547) {
                        if (features[5] <= 7.762499809265137) {
                            if (features[5] <= 7.589600086212158) {
                                classes[0] = 1;
                                classes[1] = 12;
                            } else {
                                if (features[2] <= 25.849559783935547) {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 8;
                                }
                            }
                        } else {
                            if (features[2] <= 7.0) {
                                classes[0] = 1;
                                classes[1] = 15;
                            } else {
                                if (features[5] <= 15.372900009155273) {
                                    if (features[5] <= 13.4375) {
                                        if (features[2] <= 19.5) {
                                            classes[0] = 1;
                                            classes[1] = 6;
                                        } else {
                                            if (features[2] <= 25.5) {
                                                classes[0] = 7;
                                                classes[1] = 1;
                                            } else {
                                                if (features[2] <= 28.5) {
                                                    classes[0] = 2;
                                                    classes[1] = 5;
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 13;
                                        classes[1] = 2;
                                    }
                                } else {
                                    if (features[6] <= 1.5) {
                                        classes[0] = 0;
                                        classes[1] = 10;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 4;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[4] <= 1.5) {
                            if (features[5] <= 9.53125) {
                                classes[0] = 6;
                                classes[1] = 1;
                            } else {
                                classes[0] = 5;
                                classes[1] = 5;
                            }
                        } else {
                            classes[0] = 7;
                            classes[1] = 1;
                        }
                    }
                } else {
                    classes[0] = 15;
                    classes[1] = 1;
                }
            }
        } else {
            if (features[2] <= 9.5) {
                if (features[3] <= 3.0) {
                    classes[0] = 0;
                    classes[1] = 20;
                } else {
                    if (features[5] <= 35.537498474121094) {
                        classes[0] = 4;
                        classes[1] = 1;
                    } else {
                        classes[0] = 7;
                        classes[1] = 0;
                    }
                }
            } else {
                if (features[5] <= 26.268749237060547) {
                    if (features[3] <= 0.5) {
                        if (features[5] <= 14.160400390625) {
                            if (features[5] <= 12.762499809265137) {
                                if (features[2] <= 29.349559783935547) {
                                    if (features[5] <= 7.227099895477295) {
                                        if (features[2] <= 24.5) {
                                            classes[0] = 5;
                                            classes[1] = 4;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 2;
                                        }
                                    } else {
                                        if (features[2] <= 26.5) {
                                            if (features[5] <= 8.104150772094727) {
                                                if (features[5] <= 7.987500190734863) {
                                                    if (features[5] <= 7.785400390625) {
                                                        classes[0] = 22;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[5] <= 7.875) {
                                                            classes[0] = 7;
                                                            classes[1] = 2;
                                                        } else {
                                                            classes[0] = 9;
                                                            classes[1] = 0;
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 3;
                                                }
                                            } else {
                                                classes[0] = 27;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[5] <= 8.279150009155273) {
                                                classes[0] = 8;
                                                classes[1] = 1;
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 3;
                                            }
                                        }
                                    }
                                } else {
                                    if (features[2] <= 43.5) {
                                        if (features[2] <= 32.5) {
                                            if (features[2] <= 31.5) {
                                                if (features[6] <= 1.5) {
                                                    if (features[5] <= 7.227099895477295) {
                                                        classes[0] = 7;
                                                        classes[1] = 0;
                                                    } else {
                                                        if (features[5] <= 7.477099895477295) {
                                                            classes[0] = 8;
                                                            classes[1] = 1;
                                                        } else {
                                                            classes[0] = 22;
                                                            classes[1] = 1;
                                                        }
                                                    }
                                                } else {
                                                    if (features[5] <= 7.972900390625) {
                                                        classes[0] = 33;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 23;
                                                        classes[1] = 1;
                                                    }
                                                }
                                            } else {
                                                classes[0] = 12;
                                                classes[1] = 3;
                                            }
                                        } else {
                                            classes[0] = 44;
                                            classes[1] = 0;
                                        }
                                    } else {
                                        if (features[5] <= 7.889599800109863) {
                                            classes[0] = 8;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 10;
                                            classes[1] = 4;
                                        }
                                    }
                                }
                            } else {
                                if (features[2] <= 28.849559783935547) {
                                    classes[0] = 15;
                                    classes[1] = 0;
                                } else {
                                    if (features[2] <= 38.0) {
                                        classes[0] = 2;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 5;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 30;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[2] <= 21.0) {
                            classes[0] = 7;
                            classes[1] = 6;
                        } else {
                            if (features[2] <= 32.5) {
                                if (features[5] <= 22.464599609375) {
                                    if (features[5] <= 15.372900009155273) {
                                        classes[0] = 10;
                                        classes[1] = 3;
                                    } else {
                                        classes[0] = 10;
                                        classes[1] = 0;
                                    }
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 3;
                                }
                            } else {
                                classes[0] = 14;
                                classes[1] = 0;
                            }
                        }
                    }
                } else {
                    if (features[2] <= 25.5) {
                        classes[0] = 22;
                        classes[1] = 0;
                    } else {
                        if (features[2] <= 53.5) {
                            if (features[5] <= 27.135398864746094) {
                                classes[0] = 2;
                                classes[1] = 10;
                            } else {
                                if (features[5] <= 29.100000381469727) {
                                    classes[0] = 10;
                                    classes[1] = 0;
                                } else {
                                    if (features[5] <= 86.28959655761719) {
                                        if (features[5] <= 37.0) {
                                            if (features[5] <= 30.75) {
                                                classes[0] = 2;
                                                classes[1] = 9;
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 5;
                                            }
                                        } else {
                                            if (features[5] <= 52.277099609375) {
                                                classes[0] = 12;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 59.052101135253906) {
                                                    if (features[3] <= 0.5) {
                                                        classes[0] = 2;
                                                        classes[1] = 6;
                                                    } else {
                                                        classes[0] = 2;
                                                        classes[1] = 4;
                                                    }
                                                } else {
                                                    classes[0] = 11;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    } else {
                                        classes[0] = 2;
                                        classes[1] = 10;
                                    }
                                }
                            }
                        } else {
                            classes[0] = 14;
                            classes[1] = 0;
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_37(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 11.25) {
                    classes[0] = 3;
                    classes[1] = 6;
                } else {
                    if (features[5] <= 29.356250762939453) {
                        if (features[2] <= 37.0) {
                            if (features[2] <= 27.5) {
                                if (features[2] <= 23.5) {
                                    classes[0] = 0;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 3;
                                    classes[1] = 7;
                                }
                            } else {
                                classes[0] = 0;
                                classes[1] = 18;
                            }
                        } else {
                            if (features[2] <= 44.5) {
                                classes[0] = 2;
                                classes[1] = 4;
                            } else {
                                classes[0] = 1;
                                classes[1] = 7;
                            }
                        }
                    } else {
                        if (features[4] <= 1.5) {
                            classes[0] = 0;
                            classes[1] = 76;
                        } else {
                            if (features[5] <= 135.77499389648438) {
                                classes[0] = 0;
                                classes[1] = 7;
                            } else {
                                classes[0] = 3;
                                classes[1] = 10;
                            }
                        }
                    }
                }
            } else {
                if (features[4] <= 0.5) {
                    if (features[2] <= 30.25) {
                        if (features[5] <= 7.887499809265137) {
                            if (features[2] <= 24.0) {
                                classes[0] = 0;
                                classes[1] = 14;
                            } else {
                                if (features[5] <= 7.762499809265137) {
                                    classes[0] = 2;
                                    classes[1] = 13;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 7;
                                }
                            }
                        } else {
                            if (features[5] <= 9.839599609375) {
                                if (features[5] <= 8.039600372314453) {
                                    classes[0] = 4;
                                    classes[1] = 5;
                                } else {
                                    classes[0] = 7;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[2] <= 27.849559783935547) {
                                    classes[0] = 3;
                                    classes[1] = 7;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 9;
                                }
                            }
                        }
                    } else {
                        classes[0] = 8;
                        classes[1] = 3;
                    }
                } else {
                    if (features[5] <= 23.254150390625) {
                        if (features[5] <= 16.100000381469727) {
                            classes[0] = 10;
                            classes[1] = 3;
                        } else {
                            if (features[5] <= 20.662500381469727) {
                                classes[0] = 2;
                                classes[1] = 7;
                            } else {
                                classes[0] = 4;
                                classes[1] = 3;
                            }
                        }
                    } else {
                        if (features[5] <= 31.331249237060547) {
                            classes[0] = 10;
                            classes[1] = 0;
                        } else {
                            classes[0] = 6;
                            classes[1] = 2;
                        }
                    }
                }
            }
        } else {
            if (features[2] <= 14.0) {
                if (features[3] <= 2.5) {
                    if (features[2] <= 8.5) {
                        classes[0] = 0;
                        classes[1] = 14;
                    } else {
                        classes[0] = 1;
                        classes[1] = 6;
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 12;
                        classes[1] = 0;
                    } else {
                        classes[0] = 6;
                        classes[1] = 1;
                    }
                }
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 52.5) {
                        if (features[2] <= 31.5) {
                            if (features[2] <= 26.5) {
                                classes[0] = 7;
                                classes[1] = 6;
                            } else {
                                if (features[6] <= 1.0) {
                                    classes[0] = 14;
                                    classes[1] = 1;
                                } else {
                                    if (features[5] <= 38.95000076293945) {
                                        classes[0] = 8;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 6;
                                        classes[1] = 1;
                                    }
                                }
                            }
                        } else {
                            if (features[2] <= 36.5) {
                                classes[0] = 6;
                                classes[1] = 10;
                            } else {
                                if (features[5] <= 30.350000381469727) {
                                    classes[0] = 12;
                                    classes[1] = 3;
                                } else {
                                    if (features[2] <= 43.0) {
                                        classes[0] = 2;
                                        classes[1] = 6;
                                    } else {
                                        classes[0] = 9;
                                        classes[1] = 5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 57.0) {
                            classes[0] = 8;
                            classes[1] = 2;
                        } else {
                            if (features[5] <= 31.160400390625) {
                                classes[0] = 8;
                                classes[1] = 1;
                            } else {
                                classes[0] = 11;
                                classes[1] = 0;
                            }
                        }
                    }
                } else {
                    if (features[5] <= 19.377099990844727) {
                        if (features[4] <= 0.5) {
                            if (features[5] <= 7.910400390625) {
                                if (features[5] <= 2.0062499046325684) {
                                    classes[0] = 8;
                                    classes[1] = 3;
                                } else {
                                    if (features[5] <= 7.86460018157959) {
                                        if (features[5] <= 7.762499809265137) {
                                            if (features[2] <= 27.75) {
                                                if (features[5] <= 7.23960018157959) {
                                                    if (features[5] <= 7.133349895477295) {
                                                        classes[0] = 13;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 6;
                                                        classes[1] = 3;
                                                    }
                                                } else {
                                                    classes[0] = 13;
                                                    classes[1] = 0;
                                                }
                                            } else {
                                                if (features[5] <= 7.743750095367432) {
                                                    classes[0] = 33;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[2] <= 30.349559783935547) {
                                                        classes[0] = 8;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 7;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 29.349559783935547) {
                                                if (features[2] <= 24.5) {
                                                    classes[0] = 8;
                                                    classes[1] = 0;
                                                } else {
                                                    classes[0] = 11;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                classes[0] = 4;
                                                classes[1] = 4;
                                            }
                                        }
                                    } else {
                                        if (features[6] <= 1.0) {
                                            classes[0] = 8;
                                            classes[1] = 1;
                                        } else {
                                            classes[0] = 37;
                                            classes[1] = 0;
                                        }
                                    }
                                }
                            } else {
                                if (features[5] <= 7.987500190734863) {
                                    classes[0] = 4;
                                    classes[1] = 7;
                                } else {
                                    if (features[2] <= 19.5) {
                                        if (features[2] <= 17.5) {
                                            classes[0] = 13;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 11.0) {
                                                classes[0] = 4;
                                                classes[1] = 7;
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 0;
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 12.762499809265137) {
                                            if (features[2] <= 28.5) {
                                                classes[0] = 30;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 32.5) {
                                                    if (features[5] <= 8.081250190734863) {
                                                        classes[0] = 15;
                                                        classes[1] = 1;
                                                    } else {
                                                        if (features[2] <= 29.849559783935547) {
                                                            classes[0] = 5;
                                                            classes[1] = 3;
                                                        } else {
                                                            classes[0] = 6;
                                                            classes[1] = 2;
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 23;
                                                    classes[1] = 0;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 37.5) {
                                                if (features[5] <= 15.975000381469727) {
                                                    if (features[5] <= 13.25) {
                                                        if (features[2] <= 28.849559783935547) {
                                                            classes[0] = 9;
                                                            classes[1] = 0;
                                                        } else {
                                                            classes[0] = 7;
                                                            classes[1] = 4;
                                                        }
                                                    } else {
                                                        classes[0] = 15;
                                                        classes[1] = 0;
                                                    }
                                                } else {
                                                    classes[0] = 4;
                                                    classes[1] = 2;
                                                }
                                            } else {
                                                classes[0] = 5;
                                                classes[1] = 4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            classes[0] = 4;
                            classes[1] = 4;
                        }
                    } else {
                        if (features[5] <= 49.037498474121094) {
                            classes[0] = 66;
                            classes[1] = 0;
                        } else {
                            if (features[5] <= 63.02290344238281) {
                                classes[0] = 2;
                                classes[1] = 4;
                            } else {
                                classes[0] = 12;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_38(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[5] <= 28.856250762939453) {
                    if (features[2] <= 48.5) {
                        if (features[2] <= 23.5) {
                            classes[0] = 0;
                            classes[1] = 21;
                        } else {
                            if (features[2] <= 27.0) {
                                classes[0] = 3;
                                classes[1] = 5;
                            } else {
                                if (features[2] <= 37.0) {
                                    classes[0] = 0;
                                    classes[1] = 19;
                                } else {
                                    classes[0] = 1;
                                    classes[1] = 6;
                                }
                            }
                        }
                    } else {
                        classes[0] = 2;
                        classes[1] = 4;
                    }
                } else {
                    if (features[4] <= 1.5) {
                        classes[0] = 0;
                        classes[1] = 93;
                    } else {
                        if (features[5] <= 135.77499389648438) {
                            classes[0] = 0;
                            classes[1] = 12;
                        } else {
                            classes[0] = 1;
                            classes[1] = 5;
                        }
                    }
                }
            } else {
                if (features[5] <= 7.887499809265137) {
                    if (features[5] <= 7.78125) {
                        if (features[2] <= 23.5) {
                            classes[0] = 2;
                            classes[1] = 12;
                        } else {
                            if (features[5] <= 7.743750095367432) {
                                classes[0] = 2;
                                classes[1] = 5;
                            } else {
                                classes[0] = 7;
                                classes[1] = 2;
                            }
                        }
                    } else {
                        classes[0] = 1;
                        classes[1] = 18;
                    }
                } else {
                    if (features[2] <= 5.5) {
                        if (features[2] <= 3.5) {
                            classes[0] = 2;
                            classes[1] = 4;
                        } else {
                            classes[0] = 0;
                            classes[1] = 8;
                        }
                    } else {
                        if (features[3] <= 1.5) {
                            if (features[5] <= 9.839599609375) {
                                if (features[5] <= 8.672900199890137) {
                                    classes[0] = 11;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 6;
                                    classes[1] = 2;
                                }
                            } else {
                                if (features[2] <= 26.5) {
                                    classes[0] = 8;
                                    classes[1] = 2;
                                } else {
                                    if (features[4] <= 0.5) {
                                        if (features[5] <= 15.800000190734863) {
                                            classes[0] = 4;
                                            classes[1] = 6;
                                        } else {
                                            classes[0] = 1;
                                            classes[1] = 4;
                                        }
                                    } else {
                                        if (features[5] <= 20.231250762939453) {
                                            classes[0] = 5;
                                            classes[1] = 2;
                                        } else {
                                            classes[0] = 4;
                                            classes[1] = 3;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 26.683349609375) {
                                classes[0] = 6;
                                classes[1] = 1;
                            } else {
                                classes[0] = 10;
                                classes[1] = 0;
                            }
                        }
                    }
                }
            }
        } else {
            if (features[0] <= 1.5) {
                if (features[2] <= 60.5) {
                    if (features[2] <= 33.0) {
                        if (features[2] <= 28.5) {
                            if (features[2] <= 24.5) {
                                classes[0] = 12;
                                classes[1] = 3;
                            } else {
                                classes[0] = 5;
                                classes[1] = 11;
                            }
                        } else {
                            if (features[5] <= 37.54999923706055) {
                                if (features[5] <= 28.725000381469727) {
                                    classes[0] = 12;
                                    classes[1] = 1;
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 5;
                                }
                            } else {
                                classes[0] = 10;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        if (features[2] <= 36.5) {
                            classes[0] = 2;
                            classes[1] = 10;
                        } else {
                            if (features[3] <= 0.5) {
                                if (features[5] <= 27.135398864746094) {
                                    classes[0] = 4;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 16;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 56.41460037231445) {
                                    classes[0] = 7;
                                    classes[1] = 8;
                                } else {
                                    classes[0] = 0;
                                    classes[1] = 7;
                                }
                            }
                        }
                    }
                } else {
                    classes[0] = 13;
                    classes[1] = 1;
                }
            } else {
                if (features[2] <= 8.5) {
                    if (features[3] <= 2.0) {
                        classes[0] = 0;
                        classes[1] = 12;
                    } else {
                        classes[0] = 8;
                        classes[1] = 1;
                    }
                } else {
                    if (features[5] <= 51.697898864746094) {
                        if (features[6] <= 1.5) {
                            if (features[2] <= 22.5) {
                                classes[0] = 6;
                                classes[1] = 4;
                            } else {
                                if (features[5] <= 15.14579963684082) {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 11;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 49;
                                        classes[1] = 0;
                                    }
                                } else {
                                    if (features[0] <= 2.5) {
                                        classes[0] = 8;
                                        classes[1] = 0;
                                    } else {
                                        classes[0] = 3;
                                        classes[1] = 4;
                                    }
                                }
                            }
                        } else {
                            if (features[5] <= 20.549999237060547) {
                                if (features[2] <= 16.5) {
                                    classes[0] = 7;
                                    classes[1] = 2;
                                } else {
                                    if (features[2] <= 31.5) {
                                        if (features[5] <= 7.797900199890137) {
                                            if (features[2] <= 28.349559783935547) {
                                                if (features[2] <= 20.5) {
                                                    classes[0] = 11;
                                                    classes[1] = 0;
                                                } else {
                                                    if (features[5] <= 7.712500095367432) {
                                                        if (features[5] <= 7.195849895477295) {
                                                            classes[0] = 9;
                                                            classes[1] = 2;
                                                        } else {
                                                            classes[0] = 8;
                                                            classes[1] = 0;
                                                        }
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 2;
                                                    }
                                                }
                                            } else {
                                                classes[0] = 19;
                                                classes[1] = 0;
                                            }
                                        } else {
                                            if (features[5] <= 8.081250190734863) {
                                                classes[0] = 68;
                                                classes[1] = 0;
                                            } else {
                                                if (features[5] <= 8.831250190734863) {
                                                    classes[0] = 6;
                                                    classes[1] = 2;
                                                } else {
                                                    if (features[2] <= 19.5) {
                                                        classes[0] = 12;
                                                        classes[1] = 1;
                                                    } else {
                                                        classes[0] = 52;
                                                        classes[1] = 0;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (features[5] <= 7.910400390625) {
                                            classes[0] = 23;
                                            classes[1] = 0;
                                        } else {
                                            if (features[2] <= 43.0) {
                                                if (features[2] <= 38.0) {
                                                    if (features[5] <= 9.577099800109863) {
                                                        classes[0] = 8;
                                                        classes[1] = 2;
                                                    } else {
                                                        classes[0] = 12;
                                                        classes[1] = 1;
                                                    }
                                                } else {
                                                    classes[0] = 7;
                                                    classes[1] = 3;
                                                }
                                            } else {
                                                classes[0] = 14;
                                                classes[1] = 0;
                                            }
                                        }
                                    }
                                }
                            } else {
                                classes[0] = 42;
                                classes[1] = 0;
                            }
                        }
                    } else {
                        classes[0] = 9;
                        classes[1] = 3;
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict_39(double[] features) {
        int[] classes = new int[2];

        if (features[1] <= 0.5) {
            if (features[0] <= 2.5) {
                if (features[2] <= 5.5) {
                    classes[0] = 1;
                    classes[1] = 4;
                } else {
                    if (features[2] <= 56.5) {
                        if (features[2] <= 27.5) {
                            if (features[2] <= 24.5) {
                                classes[0] = 0;
                                classes[1] = 56;
                            } else {
                                classes[0] = 2;
                                classes[1] = 8;
                            }
                        } else {
                            classes[0] = 0;
                            classes[1] = 93;
                        }
                    } else {
                        classes[0] = 1;
                        classes[1] = 4;
                    }
                }
            } else {
                if (features[2] <= 31.5) {
                    if (features[5] <= 20.799999237060547) {
                        if (features[2] <= 16.5) {
                            if (features[2] <= 13.5) {
                                classes[0] = 0;
                                classes[1] = 8;
                            } else {
                                classes[0] = 2;
                                classes[1] = 8;
                            }
                        } else {
                            if (features[5] <= 8.03125) {
                                if (features[5] <= 7.699999809265137) {
                                    classes[0] = 6;
                                    classes[1] = 4;
                                } else {
                                    if (features[2] <= 25.5) {
                                        classes[0] = 5;
                                        classes[1] = 9;
                                    } else {
                                        if (features[5] <= 7.820849895477295) {
                                            classes[0] = 0;
                                            classes[1] = 11;
                                        } else {
                                            classes[0] = 2;
                                            classes[1] = 8;
                                        }
                                    }
                                }
                            } else {
                                if (features[5] <= 10.824999809265137) {
                                    if (features[5] <= 9.587499618530273) {
                                        classes[0] = 4;
                                        classes[1] = 2;
                                    } else {
                                        classes[0] = 7;
                                        classes[1] = 1;
                                    }
                                } else {
                                    if (features[4] <= 0.5) {
                                        classes[0] = 4;
                                        classes[1] = 5;
                                    } else {
                                        classes[0] = 1;
                                        classes[1] = 6;
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 8.5) {
                            classes[0] = 5;
                            classes[1] = 5;
                        } else {
                            classes[0] = 9;
                            classes[1] = 1;
                        }
                    }
                } else {
                    if (features[4] <= 0.5) {
                        classes[0] = 6;
                        classes[1] = 2;
                    } else {
                        classes[0] = 10;
                        classes[1] = 1;
                    }
                }
            }
        } else {
            if (features[2] <= 0.9600000381469727) {
                classes[0] = 0;
                classes[1] = 9;
            } else {
                if (features[0] <= 1.5) {
                    if (features[2] <= 50.0) {
                        if (features[5] <= 26.143749237060547) {
                            classes[0] = 11;
                            classes[1] = 0;
                        } else {
                            if (features[5] <= 27.135398864746094) {
                                classes[0] = 1;
                                classes[1] = 13;
                            } else {
                                if (features[5] <= 30.25) {
                                    classes[0] = 7;
                                    classes[1] = 1;
                                } else {
                                    if (features[5] <= 37.0) {
                                        classes[0] = 4;
                                        classes[1] = 8;
                                    } else {
                                        if (features[5] <= 49.54999923706055) {
                                            classes[0] = 8;
                                            classes[1] = 0;
                                        } else {
                                            if (features[5] <= 77.00834655761719) {
                                                if (features[5] <= 54.270851135253906) {
                                                    classes[0] = 4;
                                                    classes[1] = 2;
                                                } else {
                                                    classes[0] = 2;
                                                    classes[1] = 9;
                                                }
                                            } else {
                                                if (features[4] <= 1.5) {
                                                    if (features[2] <= 32.34955978393555) {
                                                        classes[0] = 8;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 9;
                                                        classes[1] = 4;
                                                    }
                                                } else {
                                                    classes[0] = 2;
                                                    classes[1] = 4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (features[2] <= 59.0) {
                            classes[0] = 11;
                            classes[1] = 0;
                        } else {
                            classes[0] = 10;
                            classes[1] = 3;
                        }
                    }
                } else {
                    if (features[2] <= 9.5) {
                        if (features[3] <= 2.0) {
                            classes[0] = 0;
                            classes[1] = 11;
                        } else {
                            classes[0] = 20;
                            classes[1] = 0;
                        }
                    } else {
                        if (features[6] <= 0.5) {
                            if (features[2] <= 22.5) {
                                classes[0] = 7;
                                classes[1] = 8;
                            } else {
                                if (features[5] <= 15.147899627685547) {
                                    if (features[2] <= 29.349559783935547) {
                                        classes[0] = 6;
                                        classes[1] = 2;
                                    } else {
                                        if (features[5] <= 7.227099895477295) {
                                            classes[0] = 9;
                                            classes[1] = 0;
                                        } else {
                                            classes[0] = 13;
                                            classes[1] = 1;
                                        }
                                    }
                                } else {
                                    classes[0] = 8;
                                    classes[1] = 4;
                                }
                            }
                        } else {
                            if (features[5] <= 51.697898864746094) {
                                if (features[5] <= 13.25) {
                                    if (features[5] <= 7.745850086212158) {
                                        classes[0] = 54;
                                        classes[1] = 0;
                                    } else {
                                        if (features[5] <= 12.762499809265137) {
                                            if (features[2] <= 32.5) {
                                                if (features[2] <= 30.75) {
                                                    if (features[5] <= 7.762499809265137) {
                                                        classes[0] = 11;
                                                        classes[1] = 4;
                                                    } else {
                                                        if (features[2] <= 19.5) {
                                                            if (features[2] <= 18.5) {
                                                                if (features[2] <= 17.5) {
                                                                    classes[0] = 12;
                                                                    classes[1] = 0;
                                                                } else {
                                                                    classes[0] = 8;
                                                                    classes[1] = 1;
                                                                }
                                                            } else {
                                                                classes[0] = 5;
                                                                classes[1] = 4;
                                                            }
                                                        } else {
                                                            if (features[5] <= 8.560400009155273) {
                                                                classes[0] = 71;
                                                                classes[1] = 0;
                                                            } else {
                                                                if (features[5] <= 9.287500381469727) {
                                                                    classes[0] = 5;
                                                                    classes[1] = 1;
                                                                } else {
                                                                    classes[0] = 12;
                                                                    classes[1] = 0;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    classes[0] = 5;
                                                    classes[1] = 5;
                                                }
                                            } else {
                                                if (features[5] <= 7.987500190734863) {
                                                    if (features[2] <= 40.25) {
                                                        classes[0] = 11;
                                                        classes[1] = 0;
                                                    } else {
                                                        classes[0] = 8;
                                                        classes[1] = 1;
                                                    }
                                                } else {
                                                    classes[0] = 31;
                                                    classes[1] = 0;
                                                }
                                            }
                                        } else {
                                            if (features[2] <= 27.349559783935547) {
                                                classes[0] = 9;
                                                classes[1] = 0;
                                            } else {
                                                if (features[2] <= 36.5) {
                                                    classes[0] = 3;
                                                    classes[1] = 3;
                                                } else {
                                                    classes[0] = 9;
                                                    classes[1] = 2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    classes[0] = 81;
                                    classes[1] = 0;
                                }
                            } else {
                                if (features[5] <= 63.02290344238281) {
                                    classes[0] = 2;
                                    classes[1] = 4;
                                } else {
                                    classes[0] = 9;
                                    classes[1] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < 2; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    private static int predict(double[] features) {
        int n_classes = 2;
        int[] classes = new int[n_classes];
        classes[TitanicClassifier.predict_0(features)]++;
        classes[TitanicClassifier.predict_1(features)]++;
        classes[TitanicClassifier.predict_2(features)]++;
        classes[TitanicClassifier.predict_3(features)]++;
        classes[TitanicClassifier.predict_4(features)]++;
        classes[TitanicClassifier.predict_5(features)]++;
        classes[TitanicClassifier.predict_6(features)]++;
        classes[TitanicClassifier.predict_7(features)]++;
        classes[TitanicClassifier.predict_8(features)]++;
        classes[TitanicClassifier.predict_9(features)]++;
        classes[TitanicClassifier.predict_10(features)]++;
        classes[TitanicClassifier.predict_11(features)]++;
        classes[TitanicClassifier.predict_12(features)]++;
        classes[TitanicClassifier.predict_13(features)]++;
        classes[TitanicClassifier.predict_14(features)]++;
        classes[TitanicClassifier.predict_15(features)]++;
        classes[TitanicClassifier.predict_16(features)]++;
        classes[TitanicClassifier.predict_17(features)]++;
        classes[TitanicClassifier.predict_18(features)]++;
        classes[TitanicClassifier.predict_19(features)]++;
        classes[TitanicClassifier.predict_20(features)]++;
        classes[TitanicClassifier.predict_21(features)]++;
        classes[TitanicClassifier.predict_22(features)]++;
        classes[TitanicClassifier.predict_23(features)]++;
        classes[TitanicClassifier.predict_24(features)]++;
        classes[TitanicClassifier.predict_25(features)]++;
        classes[TitanicClassifier.predict_26(features)]++;
        classes[TitanicClassifier.predict_27(features)]++;
        classes[TitanicClassifier.predict_28(features)]++;
        classes[TitanicClassifier.predict_29(features)]++;
        classes[TitanicClassifier.predict_30(features)]++;
        classes[TitanicClassifier.predict_31(features)]++;
        classes[TitanicClassifier.predict_32(features)]++;
        classes[TitanicClassifier.predict_33(features)]++;
        classes[TitanicClassifier.predict_34(features)]++;
        classes[TitanicClassifier.predict_35(features)]++;
        classes[TitanicClassifier.predict_36(features)]++;
        classes[TitanicClassifier.predict_37(features)]++;
        classes[TitanicClassifier.predict_38(features)]++;
        classes[TitanicClassifier.predict_39(features)]++;

        int class_idx = 0;
        int class_val = classes[0];
        for (int i = 1; i < n_classes; i++) {
            if (classes[i] > class_val) {
                class_idx = i;
                class_val = classes[i];
            }
        }
        return class_idx;
    }

    public static boolean survived(Passenger passenger) {

        double[] features = new double[7];

        features[0] = passenger.getTicketClass().getClassNumber();
        features[1] = passenger.getSex() == Sex.FEMALE ? 0 : 1;
        features[2] = passenger.getAge();
        features[3] = passenger.getSibsp();
        features[4] = passenger.getParch();
        features[5] = passenger.getFare();
        features[6] = PortEmbrkationEncoder.transform(passenger.getPortEmbarkation());

        return predict(features) == 1;
    }
}