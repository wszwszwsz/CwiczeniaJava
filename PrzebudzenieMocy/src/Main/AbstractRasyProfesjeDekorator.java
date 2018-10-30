package Main;

abstract public class AbstractRasyProfesjeDekorator extends AbstractRasyProfesje {
    protected AbstractRasyProfesje bohater;

    public AbstractRasyProfesjeDekorator(AbstractRasyProfesje bohater) {
        this.bohater = bohater;
    }

        @Override
        public abstract String getRasyProfesje();
    }