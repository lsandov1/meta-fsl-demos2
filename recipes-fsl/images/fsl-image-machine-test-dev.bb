require recipes-fsl/images/fsl-image-machine-test.bb 

# Useful if you want to develop against libs in the image
IMAGE_FEATURE += "dev-pkgs"
