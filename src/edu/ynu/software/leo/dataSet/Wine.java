package edu.ynu.software.leo.dataSet;

public class Wine {
    /**
    *
    1) Alcohol
 	2) Malic acid
 	3) Ash
	4) Alcalinity of ash
 	5) Magnesium
	6) Total phenols
 	7) Flavanoids
 	8) Nonflavanoid phenols
 	9) Proanthocyanins
	10)Color intensity
 	11)Hue
 	12)OD280/OD315 of diluted wines
 	13)Proline
 	*/
    public Double Alcohol;
    public Double Malic;
    public Double Ash;
    public Double Alcalinity;
    public Double Magnesium;
    public Double phenols;
    public Double Flavanoids;
    public Double Nonflavanoid;
    public Double Proanthocyanins;
    public Double Color;
    public Double Hue;
    public Double diluted;
    public Double Proline;

    public String type;

    public Double distance(Wine obj) {
        return
                Math.sqrt(Math.pow(this.Alcohol-obj.Alcohol,2)
                        + Math.pow(this.Malic-obj.Malic,2)
                        + Math.pow(this.Ash-obj.Ash,2)
                        + Math.pow(this.Alcalinity-obj.Alcalinity,2)
                        + Math.pow(this.Magnesium-obj.Magnesium,2)
                        + Math.pow(this.phenols-obj.phenols,2)
                        + Math.pow(this.Nonflavanoid-obj.Nonflavanoid,2)
                        + Math.pow(this.Proanthocyanins-obj.Proanthocyanins,2)
                        + Math.pow(this.Color-obj.Color,2)
                        + Math.pow(this.Hue-obj.Hue,2)
                        + Math.pow(this.diluted-obj.diluted,2)
                        + Math.pow(this.Proline-obj.Proline,2)
                        + Math.pow(this.Flavanoids-obj.Flavanoids,2)
                );
    }

    public Wine plus(Wine obj) {
        this.Alcohol += obj.Alcohol;
        this.Malic += obj.Malic;
        this.Ash += obj.Ash;
        this.Alcalinity += obj.Alcalinity;
        this.Magnesium += obj.Magnesium;
        this.phenols += obj.phenols;
        this.Nonflavanoid += obj.Nonflavanoid;
        this.Proanthocyanins += obj.Proanthocyanins;
        this.Color += obj.Color;
        this.Hue += obj.Hue;
        this.diluted += obj.diluted;
        this.Proline += obj.Proline;
        this.Flavanoids += obj.Flavanoids;

        return this;
    }

    public Wine divideBy(Integer divisor) {
        this.Alcohol /= divisor;
        this.Malic /= divisor;
        this.Ash /= divisor;
        this.Alcalinity /= divisor;
        this.Magnesium /= divisor;
        this.phenols /= divisor;
        this.Nonflavanoid /= divisor;
        this.Proanthocyanins /= divisor;
        this.Color /= divisor;
        this.Hue /= divisor;
        this.diluted /= divisor;
        this.Proline /= divisor;
        this.Flavanoids /= divisor;

        return this;
    }

    public Wine(Double Alcohol, Double Malic, Double Ash, Double Alcalinity, Double Magnesium, Double phenols, Double Nonflavanoid, Double Proanthocyanins,Double Color, Double Hue, Double diluted, Double Proline, Double Flavanoids, String type) {
        this.Alcohol = Alcohol;
        this.Malic = Malic;
        this.Ash = Ash;
        this.Alcalinity = Alcalinity;
        this.Magnesium = Magnesium;
        this.phenols = phenols;
        this.Nonflavanoid = Nonflavanoid;
        this.Proanthocyanins = Proanthocyanins;
        this.Color = Color;
        this.Hue = Hue;
        this.diluted = diluted;
        this.Proline = Proline;
        this.Flavanoids = Flavanoids;
        this.type = type;
    }

    public Wine() {


        this.Alcohol = 0.0;
        this.Malic = 0.0;
        this.Ash = 0.0;
        this.Alcalinity = 0.0;
        this.Magnesium = 0.0;
        this.phenols = 0.0;
        this.Nonflavanoid = 0.0;
        this.Proanthocyanins = 0.0;
        this.Color = 0.0;
        this.Hue = 0.0;
        this.diluted = 0.0;
        this.Proline = 0.0;
        this.Flavanoids = 0.0;

        this.type = "Unknown";
    }
}
